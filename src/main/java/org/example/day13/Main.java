package org.example.day13;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User us1 = new User("abolior");
        User us2 = new User("dixat");
        User us3 = new User("dimamatrusmat");

        us1.sendMessage(us2, "������");
        us1.sendMessage(us2, "��� �������?");

        us2.sendMessage(us1, "������");
        us2.sendMessage(us1, "�����");
        us2.sendMessage(us1, "� ��?");

        us3.sendMessage(us1, "����");
        us3.sendMessage(us1, "��� ����?");
        us3.sendMessage(us1, "� ���� ������� ���");

        us1.sendMessage(us3, "���");
        us1.sendMessage(us3, "�������");
        us1.sendMessage(us3, "� ���� ��� ���");

        us3.sendMessage(us1, "����");


        MessageDatabase.showDialog(us3, us1);

    }


}
