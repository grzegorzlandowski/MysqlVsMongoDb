package com.example.mysqlvsnosql.mysql.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Player {

    @Id
    @Column(name = "player_api_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Expose(serialize = true, deserialize = true)
    Long playerApiId;
    @Expose
    String playerName;
    @Expose
    String birthday;
    @Expose
    int height;
    @Expose
    int weight;
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer1", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer1=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer2", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer2=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer3", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer3=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer4", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer4=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer5", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer5=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer6", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer6=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer7", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer7=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer8", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer8=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer9", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer9=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer10", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer10=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "homePlayer11", fetch = FetchType.LAZY)
    private Set<Match> matchhomePlayer11=new HashSet<Match>();

    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer1", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer1=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer2", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer2=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer3", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer3=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer4", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer4=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer5", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer5=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer6", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer6=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer7", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer7=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer8", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer8=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer9", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer9=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayPlayer10", fetch = FetchType.LAZY)
    private Set<Match> matchawayPlayer10=new HashSet<Match>();
    @JsonIgnore
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

    public void setPlayerApiId(Long playerApiId) {
        this.playerApiId = playerApiId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
