package com.example.mysqlvsnosql.mongodb.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@Document
public class Player {


    @Id
    private ObjectId id;

    String playerName;

    String birthday;

    int height;

    int weight;

    public Player(){

    }

}
