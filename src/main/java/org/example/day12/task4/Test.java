package org.example.day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();

        bands.add(new MusicBand(" start", 1998));
        bands.add(new MusicBand("Port", 2002));
        bands.add(new MusicBand("Prt", 2003));
        bands.add(new MusicBand("Ptart", 1999));
        bands.add(new MusicBand("Part", 2006));

        MusicBand band = new MusicBand("Pop start", 1912);

        ArrayList<Man> members = new ArrayList<>();
        members.add(new Man("Sergo", band));
        members.add(new Man("Gior", band));
        members.add(new Man("Fioe", band));
        band.setMembers(members);
        band.printMembers();


        MusicBand band1 = new MusicBand("Prt", 1992);

        MusicBand.transferMembers(band, band1);
        band1.printMembers();
    }

    public static List<MusicBand> groupsAfter2000 (List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band: bands) {
            if (band.getYear() < 2000) {
                groupsAfter2000.add(band);
            }
        }

        return groupsAfter2000;
    }
}
