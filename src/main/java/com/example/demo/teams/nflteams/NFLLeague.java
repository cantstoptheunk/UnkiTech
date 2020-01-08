package com.example.demo.teams.nflteams;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.teams.nflteams.TeamConstants.*;

public class NFLLeague {

    public static int TOTAL_NFL_REVENUE = 0;

    public static Map<String, NFLTeam> NFL_TEAMS = new HashMap<String, NFLTeam>(){{
        put(CARDINALS, new NFLTeam());

    }};

    public NFLLeague(){

    }

    /* Setters */
    public static void setTotalNflRevenue(int totalNflRevenue) {
        TOTAL_NFL_REVENUE = totalNflRevenue;
    }
}
