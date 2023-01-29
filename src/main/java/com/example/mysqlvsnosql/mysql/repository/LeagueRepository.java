package com.example.mysqlvsnosql.mysql.repository;


import com.example.mysqlvsnosql.mysql.models.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Long> {


}
