package com.example.mysqlvsnosql.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.BasicUpdate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Aspect
@Component
@SuppressWarnings("unchecked")
public class MongoUpdateAspect {

    private static final Logger logger = LoggerFactory.getLogger(MongoUpdateAspect.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Pointcut("@annotation(MongoUpdate)")
    public void pointCut() {
    }

    @Around("MongoUpdateAspect.pointCut() && @annotation(mongoUpdate)")
    public Object applyQueryUpdate(ProceedingJoinPoint joinPoint, MongoUpdate mongoUpdate) throws Throwable {
        Object[] args = joinPoint.getArgs();

        String findQuery = mongoUpdate.find();
        String updateQuery = mongoUpdate.update();
        String collection = mongoUpdate.collection();
        boolean multiUpdate = mongoUpdate.multi();

        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof Collection) {
                Collection collection1 = (Collection) args[i];
                String replaceStr = (String) collection1.stream().map(object -> {
                    if (object instanceof Number) {
                        return object.toString();
                    } else {
                        return String.format("\"%s\"", object.toString());
                    }
                }).collect(Collectors.joining(","));
                findQuery = findQuery.replace(String.format("?%s", i), replaceStr);
                updateQuery = updateQuery.replace(String.format("?%s", i), replaceStr);
            } else if (args[i] instanceof Object[]) {
                Object[] objects = (Object[]) args[i];
                String replaceStr = Arrays.stream(objects).map(object -> {
                    if (object instanceof Number) {
                        return object.toString();
                    } else {
                        return String.format("\"%s\"", object.toString());
                    }
                }).collect(Collectors.joining(","));
                findQuery = findQuery.replace(String.format("?%s", i), replaceStr);
                updateQuery = updateQuery.replace(String.format("?%s", i), replaceStr);
            } else {
                if (args[i] instanceof Number) {
                    findQuery = findQuery.replace(String.format("?%s", i), args[i].toString());
                    updateQuery.replace(String.format("?%s", i), args[i].toString());
                } else {
                    findQuery = findQuery.replace(String.format("?%s", i), String.format("\"%s\"", args[i].toString()));
                    updateQuery =
                            updateQuery.replace(String.format("?%s", i), String.format("\"%s\"", args[i].toString()));
                }
            }
        }

        Query query = new BasicQuery(findQuery);
        Update update = new BasicUpdate(updateQuery);

        if (multiUpdate) {
            mongoTemplate.updateMulti(query, update, collection);
        } else {
            mongoTemplate.updateFirst(query, update, collection);
        }
        return null;
    }
}