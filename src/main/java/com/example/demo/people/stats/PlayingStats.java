package com.example.demo.people.stats;

import com.example.demo.generic.Category;
import com.example.demo.generic.CategoryDbl;
import com.example.demo.generic.CategoryInt;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.generic.CategoryType.TYPE_PLAYING_STATS;

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
        playingStatsForPlayers.put(StatConstants.PASSING_YARDS, new CategoryInt(StatConstants.PASSING_YARDS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.TOUCHDOWNS, new CategoryInt(StatConstants.TOUCHDOWNS, TYPE_PLAYING_STATS, false, true));
        playingStatsForPlayers.put(StatConstants.YPA, new CategoryDbl(StatConstants.PASSING_YARDS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.PASS_ATTEMPTS, new CategoryInt(StatConstants.PASSING_YARDS, TYPE_PLAYING_STATS, false, true));
        playingStatsForPlayers.put(StatConstants.PASS_COMPLETED, new CategoryInt(StatConstants.PASSING_YARDS, TYPE_PLAYING_STATS, false, true));

        /* Defense Stats */
        playingStatsForPlayers.put(StatConstants.SACKS, new CategoryDbl(StatConstants.SACKS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.TACKLES, new CategoryDbl(StatConstants.TACKLES, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.INTERCEPTIONS, new CategoryInt(StatConstants.INTERCEPTIONS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.DEFLECTIONS, new CategoryInt(StatConstants.DEFLECTIONS, TYPE_PLAYING_STATS, false, false));
    }

    /* Getters */
    public Map<String, Category> getPlayingStatsForPlayers() {
        return playingStatsForPlayers;
    }
    public Category getPlayingStat(String category) {
        return playingStatsForPlayers.get(category);
    }


    /* Setters */
    public void setPlayingStatsForPlayers(Map<String, Category> playingStatsForPlayers) {
        this.playingStatsForPlayers = playingStatsForPlayers;
    }
}
