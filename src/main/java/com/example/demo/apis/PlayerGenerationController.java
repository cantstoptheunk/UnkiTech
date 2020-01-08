package com.example.demo.apis;


import com.example.demo.people.player.Player;
import com.example.demo.people.player.NFLPlayerFactory;
import com.example.demo.people.player.Position;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/api/player-factory")
@RestController
public class PlayerGenerationController {

    @PostMapping
    public ResponseEntity<String> addPlayer(@RequestBody Map<String, String> req) throws JsonProcessingException {
        Player player = NFLPlayerFactory.generatePlayer(Position.QB);
        String res = ControllerUtils.DefaultObjectToJsonString(player.getPlayerGeneralInfo());
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }


}
