package com.example.mysqlvsnosql.controllers;


import com.example.mysqlvsnosql.mysql.models.League;
import com.example.mysqlvsnosql.mysql.models.Match;
import com.example.mysqlvsnosql.mysql.services.MatchService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

@RestController
public class MysqlPerformanceMatchController {

    @Autowired
    MatchService matchService;

    private final String  Match100_JSON = "/data/100Matchesmysql.json";
    private final String  Match1000_JSON = "/data/1000Matchesmysql.json";
    private final String  Match10000_JSON = "/data/10000Matchesmysql.json";


    @RequestMapping("mysql/insertintomatch/100")
    public String insert100Matches(){

        try {
            TypeReference<List<Match>> typeReference = new TypeReference<List<Match>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(Match100_JSON);
            List<Match> matches = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            matchService.saveAll(matches);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 100 rekordów do tabeli Match: "+totalTime+"ms";
        }
        catch (Exception ex){
            return "Błąd zapytania" + ex;
        }
    }

    @RequestMapping("mysql/insertintomatch/1000")
    public String insert1000Matches(){

        try {
            TypeReference<List<Match>> typeReference = new TypeReference<List<Match>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(Match1000_JSON);
            List<Match> matches = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            matchService.saveAll(matches);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 1000 rekordów do tabeli Match: "+totalTime+"ms";
        }
        catch (Exception ex){
            return "Błąd zapytania" + ex;
        }
    }

    @RequestMapping("mysql/insertintomatch/10000")
    public String insert10000Matches(){

        try {
            TypeReference<List<Match>> typeReference = new TypeReference<List<Match>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(Match10000_JSON);
            List<Match> matches = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            matchService.saveAll(matches);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 10000 rekordów do tabeli Match: "+totalTime+"ms";
        }
        catch (Exception ex){
            return "Błąd zapytania" + ex;
        }
    }

    @RequestMapping("mysql/findmatchbyleagueandhometeam/{leaguename}/{hometeamname}")
    public String findmatchbyleagueandhometeam(@PathVariable("leaguename") String leaguename,@PathVariable("hometeamname")String hometeamname) {
        Long startTime,totalTime;
        try{
            startTime=System.currentTimeMillis();
            matchService.findmatchbyleagueandhometeam(leaguename,hometeamname);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas Wyświetlenia elementu: "+totalTime+"ms";
        }
        catch(Exception e){
            return "błąd podczas usuwania";
        }
    }

    @RequestMapping("mysql/deleteallmatches")
    public String deleteLeague() {

        Long startTime,totalTime;
        startTime=System.currentTimeMillis();
        matchService.deleteAll();
        totalTime = System.currentTimeMillis()-startTime;
        return "usunięto wszystkie Rekordóy Czas: "+ totalTime+"ms" ;
    }

    @RequestMapping("mysql/Updatebyleagueandhometeam/{leaguename}/{hometeamname}")
    public String UpdateMatchesParameters(@PathVariable("leaguename") String leaguename,@PathVariable("hometeamname")String hometeamname) {
        Long startTime,totalTime;
        try{
            startTime=System.currentTimeMillis();
            matchService.Updatebyleagueandhometeam(10,leaguename,hometeamname);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas Zmiany liczy goli: "+totalTime+"ms";
        }
        catch(Exception e){
            return "błąd podczas usuwania";
        }
    }

    @RequestMapping("mysql/deletebyteams")
    public String deletebyTeams() {
        Long startTime,totalTime;
        try{
            startTime=System.currentTimeMillis();
            matchService.deletebyteams("Arsenal","West Ham United");
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas usuniecia meczów Arsenal - West Ham: "+totalTime+"ms";
        }
        catch(Exception e){
            return "błąd podczas usuwania";
        }
    }
}
