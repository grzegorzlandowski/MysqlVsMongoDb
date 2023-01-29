package com.example.mysqlvsnosql.mysql.services;


import com.example.mysqlvsnosql.mysql.models.Player;
import com.example.mysqlvsnosql.mysql.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlayerService {


    @Autowired
    private PlayerRepository repo;

    public void save(Player player) {
        repo.save(player);
    }

    public List<Player> listAll(){
        return repo.findAll();
    }
}
