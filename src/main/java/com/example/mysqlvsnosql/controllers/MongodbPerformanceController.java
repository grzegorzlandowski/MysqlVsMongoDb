package com.example.mysqlvsnosql.controllers;



import com.example.mysqlvsnosql.mongodb.models.League;
import com.example.mysqlvsnosql.mongodb.services.LeagueServiceMongo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MongodbPerformanceController {

    @Autowired
    LeagueServiceMongo leagueServiceMongo;
    private final String League100_JSON = "/data/100leaguemongo.json";
    private final String League1000_JSON = "/data/1000leaguemongo.json";
    private final String League10000_JSON = "/data/10000leaguemongo.json";

    @RequestMapping("/mongodb/insertintoleague/100")
    public String insertIntoLeague100(){

        try {
            TypeReference<List<League>> typeReference = new TypeReference<List<League>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(League100_JSON);
            List<League> leagues = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            leagueServiceMongo.saveAll(leagues);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 100 rekordów do tabeli League: "+totalTime+"ms";
        }
        catch (Exception ex){
            return ex.toString();
        }

    }
    @RequestMapping("/mongodb/insertintoleague/1000")
    public String insertIntoLeague1000(){

        try {
            TypeReference<List<League>> typeReference = new TypeReference<List<League>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(League1000_JSON);
            List<League> leagues = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            leagueServiceMongo.saveAll(leagues);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 1000 rekordów do tabeli League: "+totalTime+"ms";
        }
        catch (Exception ex){
            return ex.toString();
        }

    }
    @RequestMapping("/mongodb/insertintoleague/10000")
    public String insertIntoLeague10000(){

        try {
            TypeReference<List<League>> typeReference = new TypeReference<List<League>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(League10000_JSON);
            List<League> leagues = new ObjectMapper().readValue(inputStream, typeReference);
            Long startTime,totalTime;
            startTime=System.currentTimeMillis();
            leagueServiceMongo.saveAll(leagues);
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas dodania 10000 rekordów do tabeli League: "+totalTime+"ms";
        }
        catch (Exception ex){
            return ex.toString();
        }

    }

    @RequestMapping("mongodb/deleteallleagues")
    public String deleteAllLeague(){
        Long startTime,totalTime;
        try{
            startTime=System.currentTimeMillis();
            leagueServiceMongo.deleteAll();
            totalTime = System.currentTimeMillis()-startTime;
            return "usunięto wszystkie Rekordóy Czas: "+totalTime+"ms";
        }
        catch(Exception e){
            return "błąd podczas usuwania";
        }
    }
    @RequestMapping("mongodb/deletebyid/{id}")
    public String deleteByObjectId(@PathVariable String id) {

        Long startTime,totalTime;
        try{
            startTime=System.currentTimeMillis();
            leagueServiceMongo.deleteById(id);
            totalTime = System.currentTimeMillis()-startTime;
            return "Usuwanie jednego elementu powiodło się. Czas: "+totalTime+"ms";
        }
        catch(Exception e){
            return "błąd podczas usuwania";
        }
    }

    @RequestMapping("mongo/findall")
    public String findAll() {

        Long startTime, totalTime;
        try {
            List<League> leagues = new ArrayList<>();
            long id = 79242;
            startTime = System.currentTimeMillis();
            leagues = leagueServiceMongo.findAll();
            totalTime = System.currentTimeMillis() - startTime;
            return "Czas Wyświetlenia wszystkich elementów:: " + totalTime + "ms";
        } catch (Exception e) {
            return "błąd podczas usuwania";
        }
    }

        @RequestMapping("mongo/findbyid/{id}")
        public String findById(@PathVariable String id) {
            Long startTime,totalTime;
            try{
                List <League> leagues=new ArrayList<>();
                startTime=System.currentTimeMillis();
                leagueServiceMongo.searchById(id);
                totalTime = System.currentTimeMillis()-startTime;
                return "Czas Wyświetlenia elementu o ID "+id+ " "+totalTime+"ms";
            }
            catch(Exception e){
                return "błąd podczas usuwania";
            }
        }

    @RequestMapping("myongodb/updateAll")
    public String updateAll() {

        Long startTime,totalTime;
            long id =24558;
            startTime=System.currentTimeMillis();
            leagueServiceMongo.updateAllLeague("test");
            totalTime = System.currentTimeMillis()-startTime;
            return "Czas Zmiany wszystkich elementów: "+totalTime+"ms";

    }
    @RequestMapping("myongodb/updatebyid/{id}")
    public String updatebyId(@PathVariable String id) {

        Long startTime,totalTime;
        startTime=System.currentTimeMillis();
        leagueServiceMongo.updateByObjectId("testowazmiana",id);
        totalTime = System.currentTimeMillis()-startTime;
        return "Czas Zmiany jednego elementu: "+totalTime+"ms";

    }






}
