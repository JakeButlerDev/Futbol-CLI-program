package com.butler;

import java.util.ArrayList;

public class Club {

    private ArrayList<String> teamRoster;
    private short yearFounded;
    private short titlesWon;
    private String homeCity;
    private String leagueDivision;
    private int stadiumCapacity;
    private int rosterSize;

    public Club(short yearFounded, short titlesWon, String homeCity, String leagueDivision, int stadiumCapacity) {
        this.yearFounded = yearFounded;
        this.titlesWon = titlesWon;
        this.homeCity = homeCity;
        this.leagueDivision = leagueDivision;
        this.stadiumCapacity = stadiumCapacity;
        this.rosterSize = teamRoster.size();
    }


    // GETTERS FOR ALL DATA POINTS.
    public ArrayList<String> getTeamRoster() {
        return teamRoster;
    }

    public short getYearFounded() {
        return yearFounded;
    }

    public short getTitlesWon() {
        return titlesWon;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public String getLeagueDivision() {
        return leagueDivision;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public int getRosterSize() {
        return rosterSize;
    }

    // Update the club division if they are promoted or relegated.
    public void updateLeagueDivision(String leagueDivision) {
        this.leagueDivision = leagueDivision;
    }

    // Update the first team roster
    public void updateTeamRoster(ArrayList<String> teamRoster) {
        this.teamRoster = teamRoster;
    }

    // Update titles won if the team has achieved honors.
    public void updateTitlesWon(byte currentYearTitles) {
        titlesWon += currentYearTitles;
    }

    // Update the stadium capacity if there have been renovations to the ground.
    public void updateStadiumCapacity(int newStadiumCapacity) {
        this.stadiumCapacity = newStadiumCapacity;
    }

    // Update the number of players if teamRoster changes.
    public void updateRosterSize(ArrayList<String> teamRoster) {
        rosterSize = teamRoster.size();
    }
}
