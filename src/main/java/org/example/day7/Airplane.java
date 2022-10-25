package org.example.day7;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String info() {return "Изготовитель: " + this.producer + ", " +
                "год выпуска: " + this.year + ", " +
                "длина: " + this.length + ", " +
                "вес: " + this.weight + ", " +
                "количество топлива в баке: " + this.fuel ;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fillUp(int up) {this.fuel = this.fuel + up;}

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    static String getLengthingAir (Airplane one, Airplane two) {
        String air1;
        String air2;

        if (one.getLength() > two.getLength()) {
            air1 = one.getProducer();
            air2 = two.getProducer();
        } else {
            air1 = two.getProducer();
            air2 = one.getProducer();
        }


        return "Самоет " + air1 + " длинее, самолета " + air2;
    }
}
