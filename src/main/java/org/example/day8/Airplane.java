package org.example.day8;

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

    public String info() {return "????????????: " + this.producer + ", " +
                "??? ???????: " + this.year + ", " +
                "?????: " + this.length + ", " +
                "???: " + this.weight + ", " +
                "?????????? ??????? ? ????: " + this.fuel ;
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

    public String toString()  {
        return "???????? " + this.producer + " \n??? " + this.weight + " \n????? " + this.length + " \n??? ??????? " + this.year + " \n??????? " + this.fuel;
    }
}
