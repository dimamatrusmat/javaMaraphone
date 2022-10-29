package org.example.day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();

        bands.add(new MusicBand("Pop start", 1912));
        bands.add(new MusicBand(" start", 1998));
        bands.add(new MusicBand("Port", 2002));
        bands.add(new MusicBand("Prt", 2003));
        bands.add(new MusicBand("Ptart", 1999));
        bands.add(new MusicBand("Part", 2006));

        System.out.println(bands);
        bands = groupsAfter2000(bands);
        System.out.println(bands);

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
