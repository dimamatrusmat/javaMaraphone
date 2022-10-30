package org.example.day12.Tesk5;

public class MusicArtist {

    private MusicBand musicBand;
    private String name;

    private int age;

    public MusicArtist (String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void setMusicBand (MusicBand band) {
        this.musicBand = band;
    }

    @Override
    public String toString() {
        return name;
    }
}
