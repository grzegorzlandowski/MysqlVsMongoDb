package com.example.mysqlvsnosql.mysql.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Team {

    @Id
    private Long teamApiId;
    private String teamLongName;
    private String teamShortName;
    @OneToMany(mappedBy = "homeTeam", fetch = FetchType.LAZY)
    private Set<Match> matchHome=new HashSet<Match>();
    @OneToMany(mappedBy = "awayTeam", fetch = FetchType.LAZY)
    private Set<Match> matchAway=new HashSet<Match>();
    @OneToMany(mappedBy = "teamApiId", fetch = FetchType.LAZY)
    private Set<TeamAttributes> teamAttributes=new HashSet<TeamAttributes>();;
    //@JsonIgnore
    public Long getTeamApiId() {
        return teamApiId;
    }

    public String getTeamLongName() {
        return teamLongName;
    }

    public String getTeamShortName() {
        return teamShortName;
    }
    @JsonIgnore
    public Set<Match> getMatchHome() {
        return matchHome;
    }
    @JsonIgnore
    public Set<Match> getMatchAway() {
        return matchAway;
    }
    @JsonIgnore
    public Set<TeamAttributes> getTeamAttributes() {
        return teamAttributes;
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
