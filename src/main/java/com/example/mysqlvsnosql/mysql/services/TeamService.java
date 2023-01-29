package com.example.mysqlvsnosql.mysql.services;


import com.example.mysqlvsnosql.mysql.models.League;
import com.example.mysqlvsnosql.mysql.models.Team;
import com.example.mysqlvsnosql.mysql.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeamService {


    @Autowired
    private TeamRepository repo;

    public void save(Team team) {
        repo.save(team);
    }

    public List<Team> listAll(){
        return repo.findAll();
    }
}
