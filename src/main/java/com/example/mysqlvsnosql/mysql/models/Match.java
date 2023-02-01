package com.example.mysqlvsnosql.mysql.models;





import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.sql.Date;

@Entity
@Table(name = "matchs")
@AllArgsConstructor
public class Match {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "country_id", nullable = true,referencedColumnName = "id")
    @Expose(serialize = true, deserialize = true)
    private Country country;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "league_id", nullable = true,referencedColumnName = "id")
    @Expose(serialize = true, deserialize = true)
    private League league;
    @Expose(serialize = true, deserialize = true)
    private String season;
    @Expose(serialize = true, deserialize = true)
    private Integer stage;
    @Expose(serialize = true, deserialize = true)
    private String date;
    @Expose(serialize = true, deserialize = true)
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_team_api_id", nullable = true,referencedColumnName = "team_api_id")
    private Team homeTeam;
    @Expose(serialize = true, deserialize = true)
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_team_api_id", nullable = true,referencedColumnName = "team_api_id")
    private Team awayTeam;
    @Expose(serialize = true, deserialize = true)
    private int homeTeamGoal;
    @Expose(serialize = true, deserialize = true)
    private int awayTeamGoal;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_1", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer1;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_2", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer2;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_3", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer3;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_4", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer4;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_5", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer5;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_6", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer6;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_7", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer7;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_8", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer8;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_9", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer9;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_10", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer10;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_11", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player homePlayer11;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_1", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer1;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_2", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer2;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_3", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer3;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_4", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer4;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_5", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer5;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_6", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer6;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_7", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer7;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_8", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer8;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_9", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer9;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_10", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer10;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_11", nullable = true,referencedColumnName = "player_api_id")
    @Expose(serialize = true, deserialize = true)
    private Player awayPlayer11;
    public Match(){

    }

    public Long getId() {
        return id;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Country getCountry() {
        return country;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public League getLeague() {
        return league;
    }

    public String getSeason() {
        return season;
    }

    public Integer getStage() {
        return stage;
    }


    public String getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Team getHomeTeam() {
        return homeTeam;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setHomeTeam(Team homeTeamApiId) {
        this.homeTeam = homeTeamApiId;
    }

    public void setAwayTeam(Team awayTeamApiId) {
        this.awayTeam = awayTeamApiId;
    }

    public int getHomeTeamGoal() {
        return homeTeamGoal;
    }

    public int getAwayTeamGoal() {
        return awayTeamGoal;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer1() {
        return homePlayer1;
    }

    public void setHomeTeamGoal(int homeTeamGoal) {
        this.homeTeamGoal = homeTeamGoal;
    }

    public void setAwayTeamGoal(int awayTeamGoal) {
        this.awayTeamGoal = awayTeamGoal;
    }

    public void setHomePlayer1(Player homePlayer1) {
        this.homePlayer1 = homePlayer1;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer2() {
        return homePlayer2;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer3() {
        return homePlayer3;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer4() {
        return homePlayer4;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer5() {
        return homePlayer5;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer6() {
        return homePlayer6;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer7() {
        return homePlayer7;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer8() {
        return homePlayer8;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer9() {
        return homePlayer9;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer10() {
        return homePlayer10;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getHomePlayer11() {
        return homePlayer11;
    }

    public void setHomePlayer2(Player homePlayer2) {
        this.homePlayer2 = homePlayer2;
    }

    public void setHomePlayer3(Player homePlayer3) {
        this.homePlayer3 = homePlayer3;
    }

    public void setHomePlayer4(Player homePlayer4) {
        this.homePlayer4 = homePlayer4;
    }

    public void setHomePlayer5(Player homePlayer5) {
        this.homePlayer5 = homePlayer5;
    }

    public void setHomePlayer6(Player homePlayer6) {
        this.homePlayer6 = homePlayer6;
    }

    public void setHomePlayer7(Player homePlayer7) {
        this.homePlayer7 = homePlayer7;
    }

    public void setHomePlayer8(Player homePlayer8) {
        this.homePlayer8 = homePlayer8;
    }

    public void setHomePlayer9(Player homePlayer9) {
        this.homePlayer9 = homePlayer9;
    }

    public void setHomePlayer10(Player homePlayer10) {
        this.homePlayer10 = homePlayer10;
    }

    public void setHomePlayer11(Player homePlayer11) {
        this.homePlayer11 = homePlayer11;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer1() {
        return awayPlayer1;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer2() {
        return awayPlayer2;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer3() {
        return awayPlayer3;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer4() {
        return awayPlayer4;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer5() {
        return awayPlayer5;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer6() {
        return awayPlayer6;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer7() {
        return awayPlayer7;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer8() {
        return awayPlayer8;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer9() {
        return awayPlayer9;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer10() {
        return awayPlayer10;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Player getAwayPlayer11() {
        return awayPlayer11;
    }

    public void setAwayPlayer1(Player awayPlayer1) {
        this.awayPlayer1 = awayPlayer1;
    }

    public void setAwayPlayer2(Player awayPlayer2) {
        this.awayPlayer2 = awayPlayer2;
    }

    public void setAwayPlayer3(Player awayPlayer3) {
        this.awayPlayer3 = awayPlayer3;
    }

    public void setAwayPlayer4(Player awayPlayer4) {
        this.awayPlayer4 = awayPlayer4;
    }

    public void setAwayPlayer5(Player awayPlayer5) {
        this.awayPlayer5 = awayPlayer5;
    }

    public void setAwayPlayer6(Player awayPlayer6) {
        this.awayPlayer6 = awayPlayer6;
    }

    public void setAwayPlayer7(Player awayPlayer7) {
        this.awayPlayer7 = awayPlayer7;
    }

    public void setAwayPlayer8(Player awayPlayer8) {
        this.awayPlayer8 = awayPlayer8;
    }

    public void setAwayPlayer9(Player awayPlayer9) {
        this.awayPlayer9 = awayPlayer9;
    }

    public void setAwayPlayer10(Player awayPlayer10) {
        this.awayPlayer10 = awayPlayer10;
    }

    public void setAwayPlayer11(Player awayPlayer11) {
        this.awayPlayer11 = awayPlayer11;
    }

}
