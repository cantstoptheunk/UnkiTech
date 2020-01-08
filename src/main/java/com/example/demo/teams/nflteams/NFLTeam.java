package com.example.demo.teams.nflteams;

public class NFLTeam {
    private String city;
    private String name;
    private TeamRoster teamRoster = new TeamRoster();
    private TeamStats teamStats = new TeamStats();

    public NFLTeam(String city, String name){
        this.city = city;
        this.name = name;
    }

    /* Getters */
    public TeamRoster getTeamRoster() {
        return teamRoster;
    }

    /* Setters */
    public void setTeamRoster(TeamRoster teamRoster) {
        this.teamRoster = teamRoster;
    }
}
