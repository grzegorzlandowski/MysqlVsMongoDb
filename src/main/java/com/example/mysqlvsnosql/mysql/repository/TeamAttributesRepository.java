package com.example.mysqlvsnosql.mysql.repository;

import com.example.mysqlvsnosql.mysql.models.TeamAttributes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamAttributesRepository extends JpaRepository<TeamAttributes, Long> {
}
