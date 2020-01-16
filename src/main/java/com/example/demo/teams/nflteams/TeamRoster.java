package com.example.demo.teams.nflteams;

import com.example.demo.generic.CategoryType;
import com.example.demo.people.player.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeamRoster {

    private List<Player> roster;
    private TeamDepthChart depthChart;

    public TeamRoster(List<Player> roster){
        this.roster = roster;
        depthChart = new TeamDepthChart(roster);
    }

    public TeamRoster(){
        roster = new ArrayList<>();
        depthChart = new TeamDepthChart(roster);
    }

    /* Setters */
    public void setDepthChart(TeamDepthChart depthChart) {
        this.depthChart = depthChart;
    }

    /* Getters */
    public TeamDepthChart getDepthChart() {
        return depthChart;
    }

    public List<Player> sortByCategory(CategoryType type, String criteria){
        Collections.sort(roster, new SortByCategory(type, criteria));
        return roster;
    }

    /* Other methods */
    public void reorderDepthChart(){
        depthChart.reorderDepthChart(roster);
    }

    /** Comparator Sort Class **/
    class SortByCategory implements Comparator<Player>{
        CategoryType type;
        private String criteria;

        private SortByCategory(CategoryType type, String criteria){
            this.type = type;
            this.criteria = criteria;
        }

        @Override
        public int compare(Player o1, Player o2) {
            double diff = calculateDiff(type, o1, o2);
            if(diff < 0){
                return -1;
            }
            else if(diff > 0){
                return 1;
            }
            return 0;
        }

        private double calculateDiff(CategoryType type, Player o1, Player o2){
            switch(type){
                case TYPE_ATTRIBUTE:
                    return o1.getAttribute(criteria).getValue() - o2.getAttribute(criteria).getValue();
                case TYPE_PLAYING_STATS:
                    return o1.getPlayingStat(criteria).getValue() - o2.getPlayingStat(criteria).getValue();
                case TYPE_NON_PLAYING_STATS:
                    return o1.getNonPlayingStat(criteria).getValue() - o2.getNonPlayingStat(criteria).getValue();
            }
            return 0;
        }
    }

}

