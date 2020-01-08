package com.example.demo.people.stats;

import com.example.demo.people.Category;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.people.stats.StatConstants.*;

public class PlayingStats {
    /* Stats for a QB */
    private Map<String, Category> playingStatsForPlayers;

    /* Stats for a RB */

    /* Stats for a WR */

    /* Stats for a D-Man */

    /* Stats for a kicker/punter */

    /* Stats for a returner */


    public PlayingStats(){
        playingStatsForPlayers = new HashMap<>();
        /* QB Stats */
        playingStatsForPlayers.put(PASSING_YARDS, new Category(PASSING_YARDS, false, false));
        playingStatsForPlayers.put(TOUCHDOWNS, new Category(TOUCHDOWNS, false, true));
        playingStatsForPlayers.put(YPA, new Category(PASSING_YARDS, false, false));
        playingStatsForPlayers.put(PASS_ATTEMPTS, new Category(PASSING_YARDS, false, true));
        playingStatsForPlayers.put(PASS_COMPLETED, new Category(PASSING_YARDS, false, true));

        /* Defense Stats */
        playingStatsForPlayers.put(SACKS, new Category(SACKS, false, false));
        playingStatsForPlayers.put(TACKLES, new Category(TACKLES, false, false));
        playingStatsForPlayers.put(INTERCEPTIONS, new Category(INTERCEPTIONS, false, false));
        playingStatsForPlayers.put(DEFLECTIONS, new Category(DEFLECTIONS, false, false));
    }

    /* Getters */
    public Map<String, Category> getPlayingStatsForPlayers() {
        return playingStatsForPlayers;
    }

    /* Setters */
    public void setPlayingStatsForPlayers(Map<String, Category> playingStatsForPlayers) {
        this.playingStatsForPlayers = playingStatsForPlayers;
    }
}
