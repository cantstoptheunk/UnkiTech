package com.example.demo.teams.nflteams;

import com.example.demo.people.player.NFLPlayerFactory;
import com.example.demo.people.player.Player;
import com.example.demo.people.player.Position;

import java.util.Arrays;
import java.util.List;

public class NFLTeamFactory {

    private NFLTeamFactory(){}


    public static TeamRoster createFullRoster(){
        List<Player> roster = Arrays.asList(
                NFLPlayerFactory.generatePlayer(Position.QB),
                NFLPlayerFactory.generatePlayer(Position.QB),
                NFLPlayerFactory.generatePlayer(Position.QB)
        );

        System.out.println(roster);
        return new TeamRoster(roster);
    }



}
