package com.butler;

import java.util.ArrayList;

public class Club {

    protected String name;
    private ArrayList<String> teamRoster;
    protected short yearFounded;
    private short titlesWon;
    protected String homeCity;
    private String leagueDivision;
    private int stadiumCapacity;
    private int rosterSize;

    public Club(String name, short yearFounded, short titlesWon, String homeCity, int stadiumCapacity) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.titlesWon = titlesWon;
        this.homeCity = homeCity;
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

    public String getName() {
        return name;
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
