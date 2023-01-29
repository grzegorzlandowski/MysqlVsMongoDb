package com.example.mysqlvsnosql.mysql.services;



import com.example.mysqlvsnosql.mysql.models.TeamAttributes;
import com.example.mysqlvsnosql.mysql.repository.TeamAttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeamAttributesService {

    @Autowired
    private TeamAttributesRepository repo;

    public void save(TeamAttributes teamAttributes) {
        repo.save(teamAttributes);
    }

    public List<TeamAttributes> listAll(){
        return repo.findAll();
    }
}
