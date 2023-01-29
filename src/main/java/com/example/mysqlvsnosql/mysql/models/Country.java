package com.example.mysqlvsnosql.mysql.models;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Country {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToMany(mappedBy = "countryId", fetch = FetchType.LAZY)
    private Set<Match>  match=new HashSet<Match>();
    @OneToMany(mappedBy = "countryId", fetch = FetchType.LAZY)
    private Set<League>  league=new HashSet<League>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Match> getMatch() {
        return match;
    }

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
