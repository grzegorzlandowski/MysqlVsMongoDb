package com.example.mysqlvsnosql.mysql.services;

import com.example.mysqlvsnosql.mysql.models.League;
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
}
