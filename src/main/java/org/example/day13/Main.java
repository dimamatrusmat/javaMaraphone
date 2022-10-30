package org.example.day13;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User us1 = new User("abolior");
        User us2 = new User("dixat");
        User us3 = new User("dimamatrusmat");

        us1.sendMessage(us2, "Привет");
        us1.sendMessage(us2, "Что делаешь?");

        us2.sendMessage(us1, "Привет");
        us2.sendMessage(us1, "Играю");
        us2.sendMessage(us1, "А ты?");

        us3.sendMessage(us1, "Хайл");
        us3.sendMessage(us1, "Как дела?");
        us3.sendMessage(us1, "У меня отлично вот");

        us1.sendMessage(us3, "Хай");
        us1.sendMessage(us3, "Понимаю");
        us1.sendMessage(us3, "У меня збс все");

        us3.sendMessage(us1, "Пока");


        MessageDatabase.showDialog(us3, us1);

    }


}
