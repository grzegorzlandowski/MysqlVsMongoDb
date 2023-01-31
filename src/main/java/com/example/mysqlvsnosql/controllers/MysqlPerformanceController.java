package com.example.mysqlvsnosql.controllers;

import com.example.mysqlvsnosql.config.HibernateProxyTypeAdapter;
import com.example.mysqlvsnosql.mysql.models.*;
import com.example.mysqlvsnosql.mysql.services.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


@RestController
public class MysqlPerformanceController {

    @Autowired
    CountryService countryService;
    @Autowired
    MatchService matchService;
    @Autowired
    LeagueService leagueService;
    @Autowired
    TeamService teamService;
    @Autowired
    PlayerService playerService;

    private final String League100_JSON = "/data/100leaguemysql.json";
    private final String League1000_JSON = "/data/1000leaguemysql.json";
    private final String League10000_JSON = "/data/10000leaguemysql.json";
    private final String Match_JSON = "C:\\Users\\grzes\\OneDrive\\Pulpit\\ProjektBazy\\src\\main\\resources\\data\\matchestest.json";

    @RequestMapping("mysql/insertintoleague/100")
    public String insert100Leagues(){

        try {
            TypeReference<List<League>> typeReference = new TypeReference<List<League>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(League100_JSON);
            List<League> leagues = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            leagueService.saveAll(leagues);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 100 rekordów do tabeli League: "+totalTime+"ms";
        }
        catch (Exception ex){
            return "Błąd zapytania";
        }
    }

    @RequestMapping("mysql/insertintoleague/1000")
    public String insert1000Leagues(){

        try {
            TypeReference<List<League>> typeReference = new TypeReference<List<League>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(League1000_JSON);
            List<League> leagues = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            leagueService.saveAll(leagues);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 1000 rekordów do tabeli League: "+totalTime+"ms";
        }
        catch (Exception ex){
            return "Błąd zapytania";
        }
    }
    @RequestMapping("mysql/insertintoleague/10000")
    public String insert10000Leagues(){

        try {
            TypeReference<List<League>> typeReference = new TypeReference<List<League>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(League10000_JSON);
            List<League> leagues = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            leagueService.saveAll(leagues);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 10000 rekordów do tabeli League: "+totalTime+"ms";
        }
        catch (Exception ex){
            return "Błąd zapytania";
        }
    }
    @RequestMapping("mysql/deleteallleagues")
    public String deleteLeague() {

        long id = 24558;
        Long startTime,totalTime;
        startTime=System.currentTimeMillis();
        leagueService.deleteWhereIdBigger(id);
        totalTime = System.currentTimeMillis()-startTime;
        return "usunięto wszystkie Rekordóy Czas: "+ totalTime+"ms" ;
    }

    @RequestMapping("mysql/deletebyid/{id}")
    public String deleteById(@PathVariable long id) {

        Long startTime,totalTime;
        try{

            startTime=System.currentTimeMillis();
            leagueService.deleteById(id);
            totalTime = System.currentTimeMillis()-startTime;
            return "Usuwanie jednego elementu powiodło się. Czas: "+totalTime+"ms";
        }
        catch(Exception e){
            return "błąd podczas usuwania";
        }
    }

    @RequestMapping("mysql/findall")
    public String findAll() {

        Long startTime,totalTime;
        try{
            List <League> leagues=new ArrayList<>();
            long id =79242;
            startTime=System.currentTimeMillis();
            leagues = leagueService.findAll();
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas Wyświetlenia wszystkich elementów: "+totalTime+"ms";
        }
        catch(Exception e){
            return "błąd podczas usuwania";
        }
}

    @RequestMapping("mysql/findbyid/{id}")
    public String findById(@PathVariable long id) {
        Long startTime,totalTime;
        try{
            startTime=System.currentTimeMillis();
            leagueService.findById(id);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas Wyświetlenia elementu o ID "+id+ " "+totalTime+"ms";
        }
        catch(Exception e){
            return "błąd podczas usuwania";
        }
    }

    @RequestMapping("mysql/updateAll")
    public String updateAll() {
        Long startTime,totalTime;
        try{
            List <League> leagues=new ArrayList<>();
            long id =24558;
            startTime=System.currentTimeMillis();
            leagueService.UpdateAll(id,"testzmiany");
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas Zmiany wszystkich elementów: "+totalTime+"ms";
        }
        catch(Exception e){
            return "błąd podczas usuwania";
        }
    }

    @RequestMapping("mysql/updatebyid/{id}")
    public String updatebyId(@PathVariable long id) {

        Long startTime,totalTime;
        startTime=System.currentTimeMillis();
        leagueService.UpdateById(id,"testowazmianka");
        totalTime = System.currentTimeMillis()-startTime;
        return "Czas Zmiany jednego elementu: "+totalTime+"ms";

    }


    @RequestMapping("/getmatches")
    public String getmatches() {

        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd")
                    .registerTypeAdapterFactory( HibernateProxyTypeAdapter.FACTORY).create() ;
            long id = 500;
                Match match = matchService.findById(id);
            gson.toJson(match, new FileWriter(Match_JSON));
            return  "eksport zakonczony";
        }
        catch (Exception e){
            return  "Błąd podczas eksportu" + e;
        }


    }



}