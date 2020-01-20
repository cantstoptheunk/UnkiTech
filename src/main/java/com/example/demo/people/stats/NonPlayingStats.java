package com.example.demo.people.stats;

import com.example.demo.generic.Category;
import com.example.demo.generic.CategoryDbl;
import com.example.demo.generic.CategoryInt;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.generic.CategoryType.TYPE_NON_PLAYING_STATS;
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
        nonPlayingStatsForPlayers.put(CAP_HIT, new CategoryDbl(CAP_HIT, TYPE_NON_PLAYING_STATS, false, true));
        nonPlayingStatsForPlayers.put(TERM, new CategoryInt(TOUCHDOWNS, TYPE_NON_PLAYING_STATS, false, true));
        nonPlayingStatsForPlayers.put(GUARANTEE, new CategoryDbl(GUARANTEE, TYPE_NON_PLAYING_STATS, false, true));
        nonPlayingStatsForPlayers.put(BONUS, new CategoryDbl(BONUS, TYPE_NON_PLAYING_STATS, false, true));
        nonPlayingStatsForPlayers.put(SALARY, new CategoryDbl(SALARY, TYPE_NON_PLAYING_STATS, false, true));
    }

    /* Getters */
    public Map<String, Category> getNonPlayingStatsForPlayers() {
        return nonPlayingStatsForPlayers;
    }
    public Category getNonPlayingStat(String name){ return nonPlayingStatsForPlayers.get(name);}

    /* Setters */
    public void setNonPlayingStatsForPlayers(Map<String, Category> nonPlayingStatsForPlayers) {
        this.nonPlayingStatsForPlayers = nonPlayingStatsForPlayers;
    }

}
