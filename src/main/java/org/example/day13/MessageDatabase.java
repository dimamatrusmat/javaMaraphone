package org.example.day13;

import java.util.ArrayList;

public class MessageDatabase {
    private static ArrayList<Message> messages = new ArrayList<>();

    public static void sendMessage (User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);

        messages.add(message);
    }

    public static ArrayList<Message> getMessages () {
        return messages;
    }

    public static void showDialog (User u1, User u2) {
        ArrayList<Message> messages1 = new ArrayList<>();

        for (Message message: messages) {
            if (((message.getSender() == u1) && (message.getReceiver() == u2) || ((message.getSender() == u2) && (message.getReceiver() == u1)))) {
                messages1.add(message);
            }
        }

        boolean sort = true;


//        while (sort) {
//            for (int i = 0; i < messages1.size() - 1; i++) {
//                // 21/10/2022 before 20/10/2022
//                if (messages1.get(i).getDate().after(messages1.get(i + 1).getDate())) {
//                    messages1.add(i, messages1.get(i));
//                    messages1.remove(i + 1);
//                    sort = false;
//                }
//            }
//            if (sort == false) {
//                sort = true;
//            } else {
//                sort = false;
//            }
//        }

        for (Message ms: messages1) {
            System.out.println(ms.getSender() + ": " + ms.getText());
        }
    }
}
