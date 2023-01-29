package com.example.mysqlvsnosql.mysql.repository;

import com.example.mysqlvsnosql.mysql.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface MatchRepository extends JpaRepository<Match, Long> {
}
