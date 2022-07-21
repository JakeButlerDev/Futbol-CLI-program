package com.butler;

import com.butler.objectfactory.UI;

public class Main {

    public static void main(String[] args) {

        String name = UI.readString("What is the name of the club?");
        short yearFounded = UI.readShort("What year was " + name + " founded?", (short)1800, (short)2022);
        short titlesWon = UI.readShort("How many division titles has this club won?", (short)0, (short)100);
        String city = UI.readString("What city is the club located in?");
        int stadiumCap = UI.readInt("What is the club's maximum stadium capacity?", 1_000, 120_000);

        Club club1 = new Club(name, yearFounded, titlesWon, city, stadiumCap);

        System.out.println(club1);

    }

}