package com.example.mysqlvsnosql.mysql.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Team {

    @Id
    @Column(name = "team_api_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Expose(serialize = true, deserialize = true)
    private Long teamApiId;
    @Expose
    private String teamLongName;
    @Expose
    private String teamShortName;
    @JsonIgnore
    @OneToMany(mappedBy = "homeTeam", fetch = FetchType.LAZY)
    private Set<Match> matchHome=new HashSet<Match>();
    @JsonIgnore
    @OneToMany(mappedBy = "awayTeam", fetch = FetchType.LAZY)
    private Set<Match> matchAway=new HashSet<Match>();

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
