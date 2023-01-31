package com.example.mysqlvsnosql.mongodb.models;

import com.example.mysqlvsnosql.mysql.models.Match;
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
public class Country {

    @Id
    private ObjectId id;

    String name;

    public Country() {
    }


}
