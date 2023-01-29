package com.example.mysqlvsnosql.mysql.models;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Team {

    @Id
    private Long teamApiId;
    private String teamLongName;
    private String teamShortName;
    @OneToMany(mappedBy = "homeTeamId", fetch = FetchType.LAZY)
    private Set<Match> matchHome=new HashSet<Match>();
    @OneToMany(mappedBy = "awayTeamId", fetch = FetchType.LAZY)
    private Set<Match> matchAway=new HashSet<Match>();
    @OneToMany(mappedBy = "teamApiId", fetch = FetchType.LAZY)
    private Set<TeamAttributes> teamAttributes=new HashSet<TeamAttributes>();;

    public Long getTeamApiId() {
        return teamApiId;
    }

    public String getTeamLongName() {
        return teamLongName;
    }

    public String getTeamShortName() {
        return teamShortName;
    }

    public void setTeamApiId(Long teamApiId) {
        this.teamApiId = teamApiId;
    }

    public void setTeamLongName(String teamLongName) {
        this.teamLongName = teamLongName;
    }

    public void setTeamShortName(String teamShortName) {
        this.teamShortName = teamShortName;
    }
}
