package com.example.mysqlvsnosql.mongodb.services;


import com.example.mysqlvsnosql.mongodb.models.Match;
import com.example.mysqlvsnosql.mongodb.repository.MatchRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceMongo {

    @Autowired
    private MatchRepositoryMongo repo;

    public void saveAll(List<Match> matches){

        repo.saveAll(matches);
    }
}
