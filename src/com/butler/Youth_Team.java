package com.butler;

import java.util.ArrayList;

public class Youth_Team extends Club {

    private ArrayList<String> youthRoster;
    private String leagueDivision;
    private byte numberOfYouthPlayers;

    public Youth_Team(String name, short yearFounded, short titlesWon, String homeCity, int stadiumCapacity) {
        super(name, yearFounded, titlesWon, homeCity, stadiumCapacity);
    }


}
