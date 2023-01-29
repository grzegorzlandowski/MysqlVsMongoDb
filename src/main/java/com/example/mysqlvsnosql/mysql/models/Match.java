package com.example.mysqlvsnosql.mysql.models;





import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "matchs")
public class Match {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "country_id", nullable = true)
    Country countryId;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "league_id", nullable = true)
    League leagueId;
    String season;
    int stage;
    Date date;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_team_api_id", nullable = true)
    Team homeTeamId;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_team_api_id", nullable = true)
    Team awayTeamId;
    int homeTeamGoal;
    int awayTeamGoal;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_1", nullable = true)
    Player homePlayer1;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_2", nullable = true)
    Player homePlayer2;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_3", nullable = true)
    Player homePlayer3;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_4", nullable = true)
    Player homePlayer4;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_5", nullable = true)
    Player homePlayer5;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_6", nullable = true)
    Player homePlayer6;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_7", nullable = true)
    Player homePlayer7;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_8", nullable = true)
    Player homePlayer8;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_9", nullable = true)
    Player homePlayer9;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_10", nullable = true)
    Player homePlayer10;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "home_player_11", nullable = true)
    Player homePlayer11;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_1", nullable = true)
    Player awayPlayer1;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_2", nullable = true)
    Player awayPlayer2;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_3", nullable = true)
    Player awayPlayer3;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_4", nullable = true)
    Player awayPlayer4;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_5", nullable = true)
    Player awayPlayer5;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_6", nullable = true)
    Player awayPlayer6;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_7", nullable = true)
    Player awayPlayer7;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_8", nullable = true)
    Player awayPlayer8;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_9", nullable = true)
    Player awayPlayer9;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_10", nullable = true)
    Player awayPlayer10;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "away_player_11", nullable = true)
    Player awayPlayer11;
    String goal;
    String shoton;
    String shotoff;
    String foulcommit;
    String card;
    String cross;
    String corner;
    String possession;

    public Long getId() {
        return id;
    }

    public Country getCountryId() {
        return countryId;
    }

    public League getLeagueId() {
        return leagueId;
    }

    public String getSeason() {
        return season;
    }

    public int getStage() {
        return stage;
    }

    public Date getDate() {
        return date;
    }

    public Team getHomeTeamId() {
        return homeTeamId;
    }

    public Team getAwayTeamId() {
        return awayTeamId;
    }

    public int getHomeTeamGoal() {
        return homeTeamGoal;
    }

    public int getAwayTeamGoal() {
        return awayTeamGoal;
    }

    public Player getHomePlayer1() {
        return homePlayer1;
    }

    public Player getHomePlayer2() {
        return homePlayer2;
    }

    public Player getHomePlayer3() {
        return homePlayer3;
    }

    public Player getHomePlayer4() {
        return homePlayer4;
    }

    public Player getHomePlayer5() {
        return homePlayer5;
    }

    public Player getHomePlayer6() {
        return homePlayer6;
    }

    public Player getHomePlayer7() {
        return homePlayer7;
    }

    public Player getHomePlayer8() {
        return homePlayer8;
    }

    public Player getHomePlayer9() {
        return homePlayer9;
    }

    public Player getHomePlayer10() {
        return homePlayer10;
    }

    public Player getHomePlayer11() {
        return homePlayer11;
    }

    public Player getAwayPlayer1() {
        return awayPlayer1;
    }

    public Player getAwayPlayer2() {
        return awayPlayer2;
    }

    public Player getAwayPlayer3() {
        return awayPlayer3;
    }

    public Player getAwayPlayer4() {
        return awayPlayer4;
    }

    public Player getAwayPlayer5() {
        return awayPlayer5;
    }

    public Player getAwayPlayer6() {
        return awayPlayer6;
    }

    public Player getAwayPlayer7() {
        return awayPlayer7;
    }

    public Player getAwayPlayer8() {
        return awayPlayer8;
    }

    public Player getAwayPlayer9() {
        return awayPlayer9;
    }

    public Player getAwayPlayer10() {
        return awayPlayer10;
    }

    public Player getAwayPlayer11() {
        return awayPlayer11;
    }

    public String getGoal() {
        return goal;
    }

    public String getShoton() {
        return shoton;
    }

    public String getShotoff() {
        return shotoff;
    }

    public String getFoulcommit() {
        return foulcommit;
    }

    public String getCard() {
        return card;
    }

    public String getCross() {
        return cross;
    }

    public String getCorner() {
        return corner;
    }

    public String getPossession() {
        return possession;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    public void setLeagueId(League leagueId) {
        this.leagueId = leagueId;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHomeTeamId(Team homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public void setAwayTeamId(Team awayTeamId) {
        this.awayTeamId = awayTeamId;
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

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public void setShoton(String shoton) {
        this.shoton = shoton;
    }

    public void setShotoff(String shotoff) {
        this.shotoff = shotoff;
    }

    public void setFoulcommit(String foulcommit) {
        this.foulcommit = foulcommit;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setCross(String cross) {
        this.cross = cross;
    }

    public void setCorner(String corner) {
        this.corner = corner;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }
}
