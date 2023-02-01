package com.example.mysqlvsnosql.mysql.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class League {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Expose(serialize = true, deserialize = true)
    private Long id;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "country_id", nullable = true)
    @Expose
    private Country country;
    @Expose
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY)
    private Set<Match> match=new HashSet<Match>();

    public League() {
    }

    public League(Country countryId, String name) {
        this.country = countryId;
        this.name = name;
    }
    //@JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    public Country getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountryId(Country countryId) {
        this.country = countryId;
    }

    public void setName(String name) {
        this.name = name;
    }


}
