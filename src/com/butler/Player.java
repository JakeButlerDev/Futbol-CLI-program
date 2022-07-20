package com.butler;

import java.util.ArrayList;

public class Player {

    private String name;
    private byte age;
    private short careerGoals;
    private ArrayList<String> clubsPlayedFor;
    private String currentClub;
    private short careerAssists;
    private String nationality;

    public Player(String name, byte age, String currentClub, short careerGoals, short careerAssists, String nationality) {
        this.name = name;
        this.age = age;
        this.currentClub = currentClub;
        clubsPlayedFor.add(currentClub);
        this.careerGoals = careerGoals;
        this.careerAssists = careerAssists;
        this.nationality = nationality;

    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public short getCareerGoals() {
        return careerGoals;
    }

    public ArrayList<String> getClubsPlayedFor() {
        return clubsPlayedFor;
    }

    public String getCurrentClub() {
        return currentClub;
    }

    public short getCareerAssists() {
        return careerAssists;
    }

    public String getNationality() {
        return nationality;
    }


}
