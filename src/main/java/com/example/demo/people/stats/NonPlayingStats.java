package com.example.demo.people.stats;

import com.example.demo.people.Category;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.people.stats.StatConstants.*;

public class NonPlayingStats {
    /* Stats for a QB */
    private Map<String, Category> nonPlayingStatsForPlayers;

    /* Stats for a RB */

    /* Stats for a WR */

    /* Stats for a D-Man */

    /* Stats for a kicker/punter */

    /* Stats for a returner */


    public NonPlayingStats(){
        nonPlayingStatsForPlayers = new HashMap<>();
        nonPlayingStatsForPlayers.put(CAP_HIT, new Category(CAP_HIT, false, true));
        nonPlayingStatsForPlayers.put(TERM, new Category(TOUCHDOWNS, false, true));
        nonPlayingStatsForPlayers.put(GUARANTEE, new Category(GUARANTEE, false, true));
        nonPlayingStatsForPlayers.put(BONUS, new Category(BONUS, false, true));
        nonPlayingStatsForPlayers.put(SALARY, new Category(SALARY, false, true));
    }

    /* Getters */
    public Map<String, Category> getNonPlayingStatsForPlayers() {
        return nonPlayingStatsForPlayers;
    }

    /* Setters */
    public void setNonPlayingStatsForPlayers(Map<String, Category> nonPlayingStatsForPlayers) {
        this.nonPlayingStatsForPlayers = nonPlayingStatsForPlayers;
    }

}
