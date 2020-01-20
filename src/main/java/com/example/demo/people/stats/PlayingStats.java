package com.example.demo.people.stats;

import com.example.demo.generic.Category;

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
        playingStatsForPlayers.put(StatConstants.PASSING_YARDS, new Category(StatConstants.PASSING_YARDS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.TOUCHDOWNS, new Category(StatConstants.TOUCHDOWNS, TYPE_PLAYING_STATS, false, true));
        playingStatsForPlayers.put(StatConstants.YPA, new Category(StatConstants.PASSING_YARDS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.PASS_ATTEMPTS, new Category(StatConstants.PASSING_YARDS, TYPE_PLAYING_STATS, false, true));
        playingStatsForPlayers.put(StatConstants.PASS_COMPLETED, new Category(StatConstants.PASSING_YARDS, TYPE_PLAYING_STATS, false, true));

        /* Defense Stats */
        playingStatsForPlayers.put(StatConstants.SACKS, new Category(StatConstants.SACKS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.TACKLES, new Category(StatConstants.TACKLES, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.INTERCEPTIONS, new Category(StatConstants.INTERCEPTIONS, TYPE_PLAYING_STATS, false, false));
        playingStatsForPlayers.put(StatConstants.DEFLECTIONS, new Category(StatConstants.DEFLECTIONS, TYPE_PLAYING_STATS, false, false));
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
