package com.example.mysqlvsnosql.mongodb.services;


import com.example.mysqlvsnosql.config.MongoUpdate;
import com.example.mysqlvsnosql.mongodb.models.Match;
import com.example.mysqlvsnosql.mongodb.repository.MatchRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceMongo {

    @Autowired
    private MatchRepositoryMongo repo;

    public void saveAll(List<Match> matches){

        repo.saveAll(matches);
    }

    public List<Match> findmatchbyleagueandhometeam(String name,String teamLongName){
        return repo.findmatchbyleagueandhometeam(name,teamLongName);
    }
    public void deleteAll(){
        repo.deleteAll();
    }

    @MongoUpdate(find =  "{'homeTeam.teamLongName' :?0 }",update = "{$set : {'homeTeamGoal' :?1}}", collection = "match", multi = true)
    public void updateByleagueandhometeam(String teamLongName, String hometeamgoal) {
    }

    public void deleteByTeams(String hometeam,String awayteam){

        repo.deleteByTeams(hometeam,awayteam);
    }
}
