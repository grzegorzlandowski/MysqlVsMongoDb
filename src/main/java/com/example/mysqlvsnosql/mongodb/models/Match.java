package com.example.mysqlvsnosql.mongodb.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@Document
public class Match {

    @Id
    private ObjectId id;
    private Country country;
    private League league;

    private String season;
    private Integer stage;

    private String date;

    private Team homeTeam;
    private Team awayTeam;

    private int homeTeamGoal;
    private int awayTeamGoal;

    private Player homePlayer1;
    private Player homePlayer2;
    private Player homePlayer3;
    private Player homePlayer4;
    private Player homePlayer5;
    private Player homePlayer6;
    private Player homePlayer7;
    private Player homePlayer8;
    private Player homePlayer9;
    private Player homePlayer10;
    private Player homePlayer11;

    private Player awayPlayer1;
    private Player awayPlayer2;
    private Player awayPlayer3;
    private Player awayPlayer4;
    private Player awayPlayer5;
    private Player awayPlayer6;
    private Player awayPlayer7;
    private Player awayPlayer8;
    private Player awayPlayer9;
    private Player awayPlayer10;
    private Player awayPlayer11;

    public Match(){

    }



}
