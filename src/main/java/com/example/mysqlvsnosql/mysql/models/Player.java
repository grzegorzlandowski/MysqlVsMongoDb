package com.example.mysqlvsnosql.mysql.models;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Player {

    @Id
    Long playerApiId;
    String playerName;
    String birthday;
    int height;
    int weight;
    @OneToMany(mappedBy = "playerApiId", fetch = FetchType.LAZY)
    private Set<PlayerAttributes> playerAttributes=new HashSet<PlayerAttributes>();

    @OneToMany(mappedBy = "homePlayer1", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer1=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer2", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer2=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer3", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer3=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer4", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer4=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer5", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer5=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer6", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer6=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer7", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer7=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer8", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer8=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer9", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer9=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer10", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer10=new HashSet<Match>();
    @OneToMany(mappedBy = "homePlayer11", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer11=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer1", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer1=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer2", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer2=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer3", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer3=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer4", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer4=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer5", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer5=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer6", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer6=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer7", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer7=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer8", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer8=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer9", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer9=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer10", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer10=new HashSet<Match>();
    @OneToMany(mappedBy = "awayPlayer11", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer11=new HashSet<Match>();


    public Long getPlayerApiId() {
        return playerApiId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Set<Match> getMatchhomePlayer1() {
        return matchhomePlayer1;
    }

    public Set<Match> getMatchhomePlayer2() {
        return matchhomePlayer2;
    }

    public Set<Match> getMatchhomePlayer3() {
        return matchhomePlayer3;
    }

    public Set<Match> getMatchhomePlayer4() {
        return matchhomePlayer4;
    }

    public Set<Match> getMatchhomePlayer5() {
        return matchhomePlayer5;
    }

    public Set<Match> getMatchhomePlayer6() {
        return matchhomePlayer6;
    }

    public Set<Match> getMatchhomePlayer7() {
        return matchhomePlayer7;
    }

    public Set<Match> getMatchhomePlayer8() {
        return matchhomePlayer8;
    }

    public Set<Match> getMatchhomePlayer9() {
        return matchhomePlayer9;
    }

    public Set<Match> getMatchhomePlayer10() {
        return matchhomePlayer10;
    }

    public Set<Match> getMatchhomePlayer11() {
        return matchhomePlayer11;
    }

    public Set<Match> getMatchawayPlayer1() {
        return matchawayPlayer1;
    }

    public Set<Match> getMatchawayPlayer2() {
        return matchawayPlayer2;
    }

    public Set<Match> getMatchawayPlayer3() {
        return matchawayPlayer3;
    }

    public Set<Match> getMatchawayPlayer4() {
        return matchawayPlayer4;
    }

    public Set<Match> getMatchawayPlayer5() {
        return matchawayPlayer5;
    }

    public Set<Match> getMatchawayPlayer6() {
        return matchawayPlayer6;
    }

    public Set<Match> getMatchawayPlayer7() {
        return matchawayPlayer7;
    }

    public Set<Match> getMatchawayPlayer8() {
        return matchawayPlayer8;
    }

    public Set<Match> getMatchawayPlayer9() {
        return matchawayPlayer9;
    }

    public Set<Match> getMatchawayPlayer10() {
        return matchawayPlayer10;
    }

    public Set<Match> getMatchawayPlayer11() {
        return matchawayPlayer11;
    }
}
