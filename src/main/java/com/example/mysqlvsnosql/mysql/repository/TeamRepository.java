package com.example.mysqlvsnosql.mysql.repository;


import com.example.mysqlvsnosql.mysql.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
