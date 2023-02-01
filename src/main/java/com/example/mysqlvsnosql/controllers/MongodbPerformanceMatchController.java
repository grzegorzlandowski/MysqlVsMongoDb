package com.example.mysqlvsnosql.controllers;

import com.example.mysqlvsnosql.mongodb.models.Match;
import com.example.mysqlvsnosql.mongodb.services.MatchServiceMongo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.List;

@RestController
public class MongodbPerformanceMatchController {

    private final String  Match100_JSON = "/data/100Matchesmongo.json";
    private final String  Match1000_JSON = "/data/1000Matchesmongo.json";
    private final String  Match10000_JSON = "/data/10000Matchesmongo.json";

    @Autowired
    MatchServiceMongo matchServiceMongo;

    @RequestMapping("mongodb/insertintomatch/100")
    public String insert100Matches(){

        try {
            TypeReference<List<Match>> typeReference = new TypeReference<List<Match>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(Match100_JSON);
            List<Match> matches = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            matchServiceMongo.saveAll(matches);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 100 rekordów do tabeli Match: "+totalTime+"ms";
        }
        catch (Exception ex){
            return "Błąd zapytania" + ex;
        }
    }

    @RequestMapping("mongodb/insertintomatch/1000")
    public String insert1000Matches(){

        try {
            TypeReference<List<Match>> typeReference = new TypeReference<List<Match>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(Match1000_JSON);
            List<Match> matches = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            matchServiceMongo.saveAll(matches);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 100 rekordów do tabeli Match: "+totalTime+"ms";
        }
        catch (Exception ex){
            return "Błąd zapytania" + ex;
        }
    }
    @RequestMapping("mongodb/insertintomatch/10000")
    public String insert10000Matches(){

        try {
            TypeReference<List<Match>> typeReference = new TypeReference<List<Match>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(Match10000_JSON);
            List<Match> matches = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            matchServiceMongo.saveAll(matches);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 100 rekordów do tabeli Match: "+totalTime+"ms";
        }
        catch (Exception ex){
            return "Błąd zapytania" + ex;
        }
    }
}
