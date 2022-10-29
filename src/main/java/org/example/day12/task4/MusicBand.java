package org.example.day12.task4;

import java.util.ArrayList;

public class MusicBand {

    private String name;
    private int year;

    private ArrayList<Man> members;

    public MusicBand (String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>();
    }

    public static void transferMembers (MusicBand one, MusicBand two) {
        for (Man i: one.getMembers()) {
            System.out.println(i);
            two.addMembers(i);
        }
    }

    public ArrayList<Man> getMembers() {

        return members;
    }

    public void setMembers(ArrayList<Man> members) {
        this.members = members;
    }

    public void addMembers(Man man) {
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
        for (Man man: members) {
            System.out.println(man + " in " + name);
        }
    }
}
