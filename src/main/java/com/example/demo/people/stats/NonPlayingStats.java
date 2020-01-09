package com.example.demo.people.stats;

import com.example.demo.generic.Category;

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
        nonPlayingStatsForPlayers.put(CAP_HIT, new Category(CAP_HIT, TYPE_NON_PLAYING_STATS, false, true));
        nonPlayingStatsForPlayers.put(TERM, new Category(TOUCHDOWNS, TYPE_NON_PLAYING_STATS, false, true));
        nonPlayingStatsForPlayers.put(GUARANTEE, new Category(GUARANTEE, TYPE_NON_PLAYING_STATS, false, true));
        nonPlayingStatsForPlayers.put(BONUS, new Category(BONUS, TYPE_NON_PLAYING_STATS, false, true));
        nonPlayingStatsForPlayers.put(SALARY, new Category(SALARY, TYPE_NON_PLAYING_STATS, false, true));
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
