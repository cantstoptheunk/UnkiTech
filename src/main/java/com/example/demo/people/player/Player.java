package com.example.demo.people.player;

import com.example.demo.people.attribute.Attribute;
import com.example.demo.people.attribute.PlayerAttributes;
import com.example.demo.people.stats.NonPlayingStats;
import com.example.demo.people.stats.PlayingStats;

import java.util.Map;
import java.util.UUID;

public class Player {

    private final UUID UUID = java.util.UUID.randomUUID();
    private PlayerGeneralInfo playerGeneralInfo;
    private PlayerAttributes playerAttributes;
    private PlayingStats playingStats;
    private NonPlayingStats nonPlayingStats;

    public Player(PlayerGeneralInfo playerGeneralInfo, PlayerAttributes playerAttributes){
        this.playerGeneralInfo = playerGeneralInfo;
        this.playerAttributes = playerAttributes;
        this.playingStats = new PlayingStats();
        this.nonPlayingStats = new NonPlayingStats();
    }

    public Player(Position pos){
        playerGeneralInfo = new PlayerGeneralInfo(pos);
        playerAttributes = new PlayerAttributes();
    }

    /* Getters */
    public UUID getUUID(){
        return UUID;
    }
    public String getId(){
        return UUID.toString();
    }
    public PlayerAttributes getPlayerAttributes() {return playerAttributes;}
    public Map<String, Attribute> getAllPlayerAttributes(){
        return playerAttributes.getAllAttributes();
    }
    public Attribute getAttribute(String name){
        return playerAttributes.getAttribute(name);
    }
    public PlayerGeneralInfo getPlayerGeneralInfo() { return playerGeneralInfo;}
    public PlayingStats getPlayingStats(){return playingStats;}
    public NonPlayingStats getNonPlayingStats(){return nonPlayingStats;}
    public Position getPlayerPosition(){ return playerGeneralInfo.getPosition();}

    /* Setters */
    public void setAllPlayerAttributes(Map<String, Attribute> attributes){playerAttributes.setAllAttributes(attributes);}
    public void setPlayingStats(PlayingStats stats){playingStats = stats;}
    public void setNonPlayingStats(NonPlayingStats stats){ nonPlayingStats = stats;}
}
