package com.example.mysqlvsnosql.repository;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("league")
public class League {

    @Id
    private String id;
    private String country;
    private String name;

    public String getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", name='" + country + '\'' +
                ", desc=" + name +
                '}';
    }
}
