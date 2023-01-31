package com.example.mysqlvsnosql.mongodb.repository;

import com.example.mysqlvsnosql.mongodb.models.League;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;


public interface LeagueRepositoryMongo extends MongoRepository<League, Long>{


    @Query(value="{'_id' : ?0}", delete = true)
    void deleteById(String id);
    @Query(value="{'_id' : ?0}")
    League searchById(String id);

}
