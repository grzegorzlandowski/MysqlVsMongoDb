package com.example.mysqlvsnosql.mongodb.services;
import com.example.mysqlvsnosql.config.MongoUpdate;
import com.example.mysqlvsnosql.mongodb.models.League;
import com.example.mysqlvsnosql.mongodb.repository.LeagueRepositoryMongo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueServiceMongo {

    @Autowired
    private LeagueRepositoryMongo repo;

    public List<League> findAll(){

        return repo.findAll();
    }

    public void saveAll(List <League> leagues){

        repo.saveAll(leagues);
    }
    public void deleteAll(){
        repo.deleteAll();
    }
    public void deleteById(String id){
            repo.deleteById(id);
    }

   public League searchById(String id){

        return repo.searchById(id);
   }

    @MongoUpdate(update = "{$set : {'name' : ?0}}", collection = "league", multi = true)
    public void updateAllLeague(String name) {

    }

    @MongoUpdate(find = "{'_id' : ?1}",update = "{$set : {'name' : ?0}}", collection = "league", multi = true)
    public void updateByObjectId(String name,String id) {

    }

}

