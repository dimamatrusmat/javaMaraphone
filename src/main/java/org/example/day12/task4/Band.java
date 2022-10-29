package org.example.day12.task4;

import java.util.ArrayList;

public class Band {

    private ArrayList<MusicBand> bands;
    private String name;

    public Band (ArrayList<MusicBand> bands, String name) {
        this.bands = bands;
        this.name = name;
    }

//    public static ArrayList<MusicBand> transferMembers (ArrayList<MusicBand> one, ArrayList<MusicBand> two) {
//        for (MusicBand i: one) {
//            two.add(i);
//        }
//
//        return two;
//    }
}
