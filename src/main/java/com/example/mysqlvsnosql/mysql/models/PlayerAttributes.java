package com.example.mysqlvsnosql.mysql.models;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class PlayerAttributes {

    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "player_api_id", nullable = false)
    private Player playerApiId;
    private Date date;
    private int overallRating;

    private int potential;
    private String preferredFoot;
    private String attackingWorkRate;
    private String defensiveWorkRate;

    private int crossing;
    private int finishing;
    private int headingAccuracy;
    private int shortPassing;
    private int volleys;
    private int dribbling;
    private int curve;
    private int freeKickAccuracy;
    private int longPassing;
    private int ballControl;
    private int acceleration;
    private int sprintSpeed;
    private int agility;
    private int reactions;
    private int balance;
    private int shotPower;
    private int jumping;
    private int stamina;
    private int strength;
    private int longShots;
    private int aggression;
    private int interceptions;
    private int positioning;
    private int vision;
    private int penalties;
    private int marking;
    private int standingTackle;
    private int slidingTackle;
    private int gkDiving;
    private int gkHandling;
    private int gkKicking;
    private int gkPositioning;
    private int gkReflexes;

}
