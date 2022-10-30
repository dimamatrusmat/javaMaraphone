package org.example.day12.Tesk5;

import java.util.ArrayList;

public class MusicBand {

    private String name;
    private int year;

    private ArrayList<MusicArtist> members;

    public MusicBand (String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>();
    }

    public static void transferMembers (MusicBand one, MusicBand two) {
        for (MusicArtist i: one.getMembers()) {
            System.out.println(i);
            two.addMembers(i);
        }
    }

    public ArrayList<MusicArtist> getMembers() {

        return members;
    }

    public void setMembers(ArrayList<MusicArtist> members) {
        this.members = members;
    }

    public void addMembers(MusicArtist man) {
        members.add(man);
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString(){
        return this.name + " " +this.year;
    }

    public void printMembers () {
        for (MusicArtist man: members) {
            System.out.println(man + " in " + name);
        }
    }
}
