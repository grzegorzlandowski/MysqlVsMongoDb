package com.example.mysqlvsnosql.mysql.repository;


import com.example.mysqlvsnosql.mysql.models.PlayerAttributes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerAttributesRepository extends JpaRepository<PlayerAttributes, Long> {
}
