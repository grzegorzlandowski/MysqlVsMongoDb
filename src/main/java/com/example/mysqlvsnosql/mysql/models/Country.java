package com.example.mysqlvsnosql.mysql.models;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.servlet.View;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Country {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @JsonIgnore
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private Set<Match>  match=new HashSet<Match>();

    @JsonIgnore
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private Set<League>  league=new HashSet<League>();
    //@JsonIgnore
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @JsonIgnore
    public Set<Match> getMatch() {
        return match;
    }
    @JsonIgnore
    public Set<League> getLeague() {
        return league;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMatch(Set<Match> match) {
        this.match = match;
    }

    public void setLeague(Set<League> league) {
        this.league = league;
    }
}
