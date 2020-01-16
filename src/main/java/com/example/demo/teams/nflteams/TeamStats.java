package com.example.demo.teams.nflteams;

public class TeamStats {
    private double capHit;

    public TeamStats(){
        capHit = NFLLeague.TEAM_SALARY_CAP;

    }

    /* Getters */
    public double getCapHit() {
        return capHit;
    }

    /* Setters */
    public void setCapHit(double capHit) {
        this.capHit = capHit;
    }
}
