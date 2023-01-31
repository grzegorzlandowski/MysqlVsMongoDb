package com.example.mysqlvsnosql.config;

import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface MongoUpdate {

    String find() default "{}";

    String update() default "{}";

    String collection();

    boolean multi() default false;
}