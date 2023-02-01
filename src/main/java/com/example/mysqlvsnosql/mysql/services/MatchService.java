package com.example.mysqlvsnosql.mysql.services;

import com.example.mysqlvsnosql.mysql.models.League;
import com.example.mysqlvsnosql.mysql.models.Match;
import com.example.mysqlvsnosql.mysql.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MatchService {

    @Autowired
    private MatchRepository repo;

    public void save(Match match) {
        repo.save(match);
    }

    public List<Match> listAll(){
        return repo.findAll();

    }
    public Match findById(Long id){

        return repo.findById(id).get();
    }

    public void saveAll(List <Match> matches){

        repo.saveAll(matches);
    }
    public List<Match> findmatchbyleagueandhometeam(String leaguename,String hometeamname){
        return repo.findmatchbyleagueandhometeam(leaguename,hometeamname);
    }

    public void deleteAll(){

        repo.deleteAll();
    }

    public void Updatebyleagueandhometeam(int goal,String leaguename,String hometeamname){
        repo.Updatebyleagueandhometeam(goal,leaguename,hometeamname);
    }
    public void deletebyteams(String hometeam,String awayteam){

        repo.deletebyteams(hometeam,awayteam);
    }

}
