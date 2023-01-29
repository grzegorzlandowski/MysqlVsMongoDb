package com.example.mysqlvsnosql.mysql.services;

import com.example.mysqlvsnosql.mysql.models.PlayerAttributes;
import com.example.mysqlvsnosql.mysql.repository.PlayerAttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlayerAttributesService {

    @Autowired
    private PlayerAttributesRepository repo;

    public void save(PlayerAttributes playerAttributes) {
        repo.save(playerAttributes);
    }

    public List<PlayerAttributes> listAll(){
        return repo.findAll();
    }
}
