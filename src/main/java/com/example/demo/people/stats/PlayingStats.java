package com.example.demo.people.stats;

import com.example.demo.generic.Category;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.generic.CategoryType.TYPE_PLAYING_STATS;
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
        playingStatsForPlayers.put(PASSING_YARDS, new Category(PASSING_YARDS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(TOUCHDOWNS, new Category(TOUCHDOWNS, TYPE_PLAYING_STATS, false, true));
        playingStatsForPlayers.put(YPA, new Category(PASSING_YARDS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(PASS_ATTEMPTS, new Category(PASSING_YARDS, TYPE_PLAYING_STATS, false, true));
        playingStatsForPlayers.put(PASS_COMPLETED, new Category(PASSING_YARDS, TYPE_PLAYING_STATS, false, true));

        /* Defense Stats */
        playingStatsForPlayers.put(SACKS, new Category(SACKS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(TACKLES, new Category(TACKLES, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(INTERCEPTIONS, new Category(INTERCEPTIONS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(DEFLECTIONS, new Category(DEFLECTIONS, TYPE_PLAYING_STATS, false, false));
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
