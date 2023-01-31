package com.example.mysqlvsnosql.mongodb.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class League {
    @Id
    private ObjectId id;
    private Country country;
    private String name;

    public League() {
    }

}
