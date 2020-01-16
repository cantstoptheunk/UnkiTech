package com.example.demo.teams.nflteams.controller;


import com.example.demo.apis.ControllerUtils;
import com.example.demo.people.player.Player;
import com.example.demo.people.player.NFLPlayerFactory;
import com.example.demo.people.player.Position;
import com.example.demo.teams.nflteams.NFLTeamFactory;
import com.example.demo.teams.nflteams.TeamRoster;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/api/roster")
@RestController
public class RosterController {

    @GetMapping
    public ResponseEntity<String> getRoster() throws JsonProcessingException {
        TeamRoster roster = NFLTeamFactory.createFullRoster();
        String res = ControllerUtils.DefaultObjectToJsonString(roster);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }


}
