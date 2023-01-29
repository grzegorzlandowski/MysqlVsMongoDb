package com.example.mysqlvsnosql.controllers;

import com.example.mysqlvsnosql.mysql.models.Country;
import com.example.mysqlvsnosql.mysql.models.Match;
import com.example.mysqlvsnosql.mysql.models.Player;
import com.example.mysqlvsnosql.mysql.models.Team;
import com.example.mysqlvsnosql.mysql.services.*;
import com.example.mysqlvsnosql.repository.League;
import com.example.mysqlvsnosql.repository.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;




@RestController
public class IndexController {

    @Autowired
    MongoService mongoService;
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

    @RequestMapping("/test")
    public String getss(){

        List<League> test = new ArrayList<>();
        List<Country> test2 = new ArrayList<>();
        List<Match> test3 = new ArrayList<>();
        List<com.example.mysqlvsnosql.mysql.models.League> test4 = new ArrayList<>();
        List<Player> test10 = new ArrayList<>();
        List<Team> test5 = new ArrayList<>();
        Long startTime,totalTime;
        startTime=System.currentTimeMillis();
        test= mongoService.findAll();
        test2=countryService.listAll();
        test3=matchService.listAll();
        test4=leagueService.listAll();
        test5=teamService.listAll();
        test10=playerService.listAll();
        totalTime = System.currentTimeMillis()-startTime;

        return test.get(1).getName() + "   Czas wykonanaia: "+ totalTime + "     "+test2.get(2).getName()+ "  " + test4.get(0).getName() + "  " +
                test5.get(0).getTeamLongName() + "  "+ test3.get(0).getHomeTeamId().getTeamLongName();





    }
}
