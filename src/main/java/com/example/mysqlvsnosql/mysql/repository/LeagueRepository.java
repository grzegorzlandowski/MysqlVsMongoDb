package com.example.mysqlvsnosql.mysql.repository;


import com.example.mysqlvsnosql.mysql.models.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LeagueRepository extends JpaRepository<League, Long> {

    @Modifying
    @Query("Delete FROM League Where id > :Id")
    void deleteWhereIdBigger(@Param("Id") long id);
    @Modifying
    @Query("UPDATE League l SET l.name = :name Where l.id > :Id")
    void UpdateAll(@Param("Id") long id,@Param("name") String name);
    @Modifying
    @Query("UPDATE League l SET l.name = :name Where l.id = :Id")
    void UpdateById(@Param("Id") long id,@Param("name") String name);


}
