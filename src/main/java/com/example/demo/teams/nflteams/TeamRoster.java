package com.example.demo.teams.nflteams;

import com.example.demo.people.player.Player;

import java.util.ArrayList;
import java.util.List;

public class TeamRoster {

    private List<Player> roster;
    private TeamDepthChart depthChart;

    public TeamRoster(){
        roster = new ArrayList<>();
        depthChart = new TeamDepthChart();
    }

    /* Setters */
    public void setDepthChart(TeamDepthChart depthChart) {
        this.depthChart = depthChart;
    }

    /* Getters */
    public TeamDepthChart getDepthChart() {
        return depthChart;
    }

    public List<Player> sortRosterByPlayingAttribute(String attribute){
        return roster;
    }

    public List<Player> sortRosterByPlayingStats(String playingStat){
        return roster;
    }

    public List<Player> sortRosterByNonPlayingStats(String nonPlayingStat){
        return roster;
    }
}
