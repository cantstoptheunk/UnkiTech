package com.example.demo.teams.nflteams;

import com.example.demo.people.player.Player;
import com.example.demo.people.player.Position;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.demo.people.attribute.AttributeConstants.OVERALL;

public class TeamDepthChart {
    Map<Position, List<Player>> fullDepthChart;

    TeamDepthChart(List<Player> roster){
        fullDepthChart = setupDepthChart(roster);
    }

    private Map<Position, List<Player>> setupDepthChart(List<Player> roster){
        Map<Position, List<Player>> completeDepthChart = new HashMap<>();

        for(Player player : roster){
            Position position = player.getPlayerPosition();
            List<Player> positionDepthChart = fullDepthChart.get(position);
            addPlayerBasedOnOverallRating(player, positionDepthChart);
            fullDepthChart.replace(player.getPlayerPosition(), positionDepthChart);
        }
        return completeDepthChart;
    }

    private void addPlayerBasedOnOverallRating(Player playerToAdd, List<Player> positionDepthChart){
        for(int i=0; i<positionDepthChart.size(); i++){
            Player player = positionDepthChart.get(i);
            if(playerToAdd.getAttribute(OVERALL).getValue() > player.getAttribute(OVERALL).getValue()){
                positionDepthChart.add(i, playerToAdd);
                return;
            }
        }
        positionDepthChart.add(playerToAdd);
    }
}
