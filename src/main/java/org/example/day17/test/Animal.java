package org.example.day17.test;

public enum Animal {
    DOG("������"), CAT("�����"), FROG("�������"), ELEPHANT("����");

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
