package org.example.day6;

public class Evaluation {

    private String name;
    private int nameInt;

    public Evaluation(int nameInt) {
        this.nameInt = nameInt;
    }

    public String getName() {
        switch (this.nameInt) {
            case 2: return "�����";
            case 3: return "�����������������";
            case 4: return "������";
            case 5: return "���";
            default: return "��������������";
        }
    }
}
