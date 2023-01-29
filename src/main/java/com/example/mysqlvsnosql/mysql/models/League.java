package com.example.mysqlvsnosql.mysql.models;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class League {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "country_id", nullable = true)
    private Country countryId;
    private String name;
    @OneToMany(mappedBy = "leagueId", fetch = FetchType.LAZY)
    private Set<Match> match=new HashSet<Match>();



    public Long getId() {
        return id;
    }

    public Country getCountryId() {
        return countryId;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
