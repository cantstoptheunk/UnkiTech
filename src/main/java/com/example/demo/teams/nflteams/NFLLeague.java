package com.example.demo.teams.nflteams;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.teams.nflteams.TeamConstants.*;

public class NFLLeague {

    private static double TWO_HUNDRED_BILLION = 200000000000.0;
    public static double TOTAL_NFL_REVENUE = TWO_HUNDRED_BILLION;
    public static double TEAM_SALARY_CAP = TOTAL_NFL_REVENUE*0.5 / 32;

    public static Map<String, NFLTeam> NFL_TEAMS = new HashMap<String, NFLTeam>(){{
        put(CARDINALS, new NFLTeam(CARDINALS, ARIZONA));
        put(SEAHAWKS, new NFLTeam(SEAHAWKS, SEATTLE));

    }};

    /* Prevent Instantiation */
    private NFLLeague(){}

    /* Setters */
    public static void setTotalNflRevenue(int totalNflRevenue) {
        TOTAL_NFL_REVENUE = totalNflRevenue;
    }

    /* Getters */
    public static Map<String, NFLTeam> getNflTeams() {
        return NFL_TEAMS;
    }
}
