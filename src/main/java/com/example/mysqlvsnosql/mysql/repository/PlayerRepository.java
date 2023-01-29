package com.example.mysqlvsnosql.mysql.repository;

import com.example.mysqlvsnosql.mysql.models.Match;
import com.example.mysqlvsnosql.mysql.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
