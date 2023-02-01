package com.example.mysqlvsnosql.mongodb.repository;


import com.example.mysqlvsnosql.mongodb.models.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepositoryMongo extends MongoRepository<Match, Long> {
}
