package com.example.mysqlvsnosql.mysql.models;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class TeamAttributes {

    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "team_api_id", nullable = false)
    private Team teamApiId;
    private Date date;
    private  int buildupplayspeed;
    private String buildupplayspeedclass;
    private int buildupplaydribbling;
    private String 	buildupplaydribblingclass;
    private int buildupplaypassing;
    private String buildupplaypassingclass;
    private String 	buildupplaypositioningclass;
    private int chancecreationpassing;
    private String chancecreationpassingclass;
    private int chancecreationcrossing;
    private String chancecreationcrossingclass;
    private int chancecreationshooting;
    private String chancecreationshootingclass;
    private String chancecreationpositioningclass;
    private int defencepressure;
    private String defencepressureclass;
    private int defenceaggression;
    private String defenceaggressionclass;
    private int defenceteamwidth;
    private String defenceteamwidthclass;
    private String defencedefenderlineclass;



}
