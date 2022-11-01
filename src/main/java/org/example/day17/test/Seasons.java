package org.example.day17.test;

public enum Seasons {
    SUMMER(40), WINTER(-30), AUTUMN(17), SPRING(20);

    private int temperature;

    private Seasons (int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

}
