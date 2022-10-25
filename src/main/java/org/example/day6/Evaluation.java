package org.example.day6;

public class Evaluation {

    private String name;
    private int nameInt;

    public Evaluation(int nameInt) {
        this.nameInt = nameInt;
    }

    public String getName() {
        switch (this.nameInt) {
            case 2: return "Хуево";
            case 3: return "Удовлетворительно";
            case 4: return "Хорошо";
            case 5: return "Збс";
            default: return "Переоцениваешь";
        }
    }
}
