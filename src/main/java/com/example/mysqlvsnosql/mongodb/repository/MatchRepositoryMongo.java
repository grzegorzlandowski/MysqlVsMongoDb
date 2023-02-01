package com.example.mysqlvsnosql.mongodb.repository;


import com.example.mysqlvsnosql.mongodb.models.Match;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MatchRepositoryMongo extends MongoRepository<Match, Long> {

    @Query(value = "{ 'league.name' : ?0,'homeTeam.teamLongName' : ?1 }")
    List<Match> findmatchbyleagueandhometeam(String name,String teamLongName);

    @Query(value = "{ $and: [ { 'homeTeam.teamLongName' : ?0 }, { 'awayTeam.teamLongName' : ?1 } ] }", delete = true)
    void deleteByTeams(String hometeam,String awayteam);
}
