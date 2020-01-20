package com.example.demo.teams.nflteams;

import com.example.demo.people.player.Player;
import com.example.demo.people.player.Position;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.demo.people.attribute.AttributeConstants.OVERALL;

public class TeamDepthChart implements Serializable {
    Map<Position, List<Player>> fullDepthChart;

    TeamDepthChart(List<Player> roster){
        fullDepthChart = setupDepthChart(roster);
    }

    public void reorderDepthChart(List<Player> roster){
        fullDepthChart = setupDepthChart(roster);
    }

    private Map<Position, List<Player>> setupDepthChart(List<Player> roster){
        Map<Position, List<Player>> completeDepthChart = new HashMap<>();
        completeDepthChart.put(Position.QB, new ArrayList<>());

        for(Player player : roster){
            Position position = player.getPlayerPosition();
            List<Player> positionDepthChart = completeDepthChart.get(position)==null ? new ArrayList<>() : completeDepthChart.get(position);
            addPlayerBasedOnOverallRating(player, positionDepthChart);
            completeDepthChart.replace(player.getPlayerPosition(), positionDepthChart);
        }
        return completeDepthChart;
    }

    private void addPlayerBasedOnOverallRating(Player playerToAdd, List<Player> positionDepthChart){
        for(int i=0; i<positionDepthChart.size(); i++){
            Player player = positionDepthChart.get(i);
            if((double)playerToAdd.getAttribute(OVERALL).getValue() > (double)player.getAttribute(OVERALL).getValue()){
                positionDepthChart.add(i, playerToAdd);
                return;
            }
        }
        positionDepthChart.add(playerToAdd);
    }
}
