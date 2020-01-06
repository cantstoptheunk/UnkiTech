package com.example.demo.category.stats;

import com.example.demo.category.Category;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.category.stats.StatConstants.*;

public class PlayingStats {
    /* Stats for a QB */
    private Map<String, Category> fullStatsForPlayers;

    /* Stats for a RB */

    /* Stats for a WR */

    /* Stats for a D-Man */

    /* Stats for a kicker/punter */

    /* Stats for a returner */


    public PlayingStats(){
        fullStatsForPlayers = new HashMap<>();
        /* QB Stats */
        fullStatsForPlayers.put(PASSING_YARDS, new Category(PASSING_YARDS, false, false));
        fullStatsForPlayers.put(TOUCHDOWNS, new Category(TOUCHDOWNS, false, true));
        fullStatsForPlayers.put(YPA, new Category(PASSING_YARDS, false, false));
        fullStatsForPlayers.put(PASS_ATTEMPTS, new Category(PASSING_YARDS, false, true));
        fullStatsForPlayers.put(PASS_COMPLETED, new Category(PASSING_YARDS, false, true));

        /* Defense Stats */
        fullStatsForPlayers.put(SACKS, new Category(SACKS, false, false));
        fullStatsForPlayers.put(TACKLES, new Category(TACKLES, false, false));
        fullStatsForPlayers.put(INTERCEPTIONS, new Category(INTERCEPTIONS, false, false));
        fullStatsForPlayers.put(DEFLECTIONS, new Category(DEFLECTIONS, false, false));
    }

    /* Getters */
    public Map<String, Category> getFullStatsForPlayers() {
        return fullStatsForPlayers;
    }

    /* Setters */
    public void setFullStatsForPlayers(Map<String, Category> fullStatsForPlayers) {
        this.fullStatsForPlayers = fullStatsForPlayers;
    }
}
