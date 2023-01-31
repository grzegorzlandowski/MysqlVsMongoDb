package com.example.mysqlvsnosql.mysql.services;

import com.example.mysqlvsnosql.mysql.models.League;
import com.example.mysqlvsnosql.mysql.models.Match;
import com.example.mysqlvsnosql.mysql.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LeagueService {


    @Autowired
    private LeagueRepository repo;

    public void save(League league) {
        repo.save(league);
    }

    public List<League> listAll(){
        return repo.findAll();
    }


    public void saveAll(List <League> leagues){

        repo.saveAll(leagues);
    }
    public void deleteAll(){

        repo.deleteAll();
    }

    public void deleteWhereIdBigger(long id){
        repo.deleteWhereIdBigger(id);
    }

    public League findById(Long id){

        return repo.findById(id).get();
    }
    public void deleteById(long id){

        repo.deleteById(id);
    }
    public List<League> findAll(){

        return repo.findAll();

    }
    public void UpdateAll(long id,String name){
        repo.UpdateAll(id,name);
    }
    public void UpdateById(long id,String name){

        repo.UpdateById(id,name);
    }
}
