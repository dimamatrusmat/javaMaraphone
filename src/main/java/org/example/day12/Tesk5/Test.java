package org.example.day12.Tesk5;

import org.example.day12.task4.Man;
import org.example.day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<org.example.day12.task4.MusicBand> bands = new ArrayList<>();

        bands.add(new org.example.day12.task4.MusicBand(" start", 1998));
        bands.add(new org.example.day12.task4.MusicBand("Port", 2002));
        bands.add(new org.example.day12.task4.MusicBand("Prt", 2003));
        bands.add(new org.example.day12.task4.MusicBand("Ptart", 1999));
        bands.add(new org.example.day12.task4.MusicBand("Part", 2006));

        org.example.day12.task4.MusicBand band = new org.example.day12.task4.MusicBand("Pop start", 1912);

        ArrayList<Man> members = new ArrayList<>();
        members.add(new Man("Sergo"));
        members.add(new Man("Gior"));
        members.add(new Man("Fioe"));
        band.setMembers(members);
        band.printMembers();


        org.example.day12.task4.MusicBand band1 = new org.example.day12.task4.MusicBand("Prt", 1992);

        org.example.day12.task4.MusicBand.transferMembers(band, band1);
        band1.printMembers();
    }

    public static List<org.example.day12.task4.MusicBand> groupsAfter2000 (List<org.example.day12.task4.MusicBand> bands) {
        List<org.example.day12.task4.MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band: bands) {
            if (band.getYear() < 2000) {
                groupsAfter2000.add(band);
            }
        }

        return groupsAfter2000;
    }
}
