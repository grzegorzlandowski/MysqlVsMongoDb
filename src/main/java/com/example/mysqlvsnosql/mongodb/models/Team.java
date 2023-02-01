package com.example.mysqlvsnosql.mongodb.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@Document
public class Team {



    @Id
    private ObjectId id;

    private String teamLongName;

    private String teamShortName;

    public Team(){

    }


}
