package com.example.mysqlvsnosql.mysql.services;

import com.example.mysqlvsnosql.mysql.models.Match;
import com.example.mysqlvsnosql.mysql.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

}
