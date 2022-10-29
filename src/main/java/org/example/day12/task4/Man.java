package org.example.day12.task4;

public class Man {

    private MusicBand musicBand;
    private String name;

    public Man (String name,  MusicBand musicBand) {
        this.name = name;
        this.musicBand = musicBand;
    }

    public Man (String name) {
        this.name = name;
        this.musicBand = null;
    }

    public void setMusicBand (MusicBand band) {
        this.musicBand = band;
    }

    @Override
    public String toString() {
        return name;
    }
}
