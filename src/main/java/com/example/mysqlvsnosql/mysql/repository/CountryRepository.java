package com.example.mysqlvsnosql.mysql.repository;

import com.example.mysqlvsnosql.mysql.models.Country;
import com.example.mysqlvsnosql.mysql.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
