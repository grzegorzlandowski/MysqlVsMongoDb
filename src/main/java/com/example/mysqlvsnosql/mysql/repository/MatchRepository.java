package com.example.mysqlvsnosql.mysql.repository;

import com.example.mysqlvsnosql.mysql.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MatchRepository extends JpaRepository<Match, Long> {

    @Query("SELECT m from Match m INNER JOIN m.league l INNER JOIN m.homeTeam ht WHERE l.name = :leaguename AND ht.teamLongName = :hometeamname")
    List<Match> findmatchbyleagueandhometeam(@Param("leaguename") String leaguename,@Param("hometeamname") String hometeamname);

    @Modifying
    @Query("UPDATE Match m SET m.homeTeamGoal = :goal Where m.league IN (select l from League l WHERE l.name = :leaguename ) AND m.homeTeam IN (select " +
            "ht from Team ht where ht.teamLongName = :hometeamname)")
    void Updatebyleagueandhometeam(@Param("goal") int goal,@Param("leaguename") String leaguename,@Param("hometeamname") String hometeamname);
    @Modifying
    @Query("DELETE FROM  Match m Where m.homeTeam IN (select ht from Team ht where ht.teamLongName = :hometeamname) AND " +
            "m.awayTeam IN (select tt from Team tt where tt.teamLongName = :awayteamname)")
    void deletebyteams(@Param("hometeamname") String hometeam,@Param("awayteamname") String awayteam);
}
