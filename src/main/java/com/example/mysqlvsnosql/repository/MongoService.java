package com.example.mysqlvsnosql.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MongoService {

    @Autowired
    private MonogRepository mongo;

    public List<League> findAll(){

        return mongo.findAll();
    }
}

