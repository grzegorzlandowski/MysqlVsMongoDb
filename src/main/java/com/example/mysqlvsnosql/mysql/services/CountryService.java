package com.example.mysqlvsnosql.mysql.services;


import com.example.mysqlvsnosql.mysql.models.Country;
import com.example.mysqlvsnosql.mysql.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CountryService {


    @Autowired
    private CountryRepository repo;

    public void save(Country country) {
        repo.save(country);
    }

    public List<Country> listAll(){
        return repo.findAll();
    }

    public Country getCountryId(Long id){

        return repo.findById(id).get();
    }
}
