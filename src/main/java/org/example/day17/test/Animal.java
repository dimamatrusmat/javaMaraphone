package org.example.day17.test;

public enum Animal {
    DOG("собата"), CAT("кошка"), FROG("л€гушка"), ELEPHANT("слон");

    private String translation;

    private Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
