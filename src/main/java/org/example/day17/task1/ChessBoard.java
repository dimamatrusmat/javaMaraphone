package org.example.day17.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ChessBoard {
    private StringBuilder sb = new StringBuilder("");

    public ChessBoard(ChessPiece [][] coordies) throws FileNotFoundException {
        File file = new File("Chees.txt");
        PrintWriter pr = new PrintWriter(file);

        for (ChessPiece [] cp: coordies) {
            for (ChessPiece c: cp) {
//                sb.append(c.getFigure());
                pr.print(c.getScil());
            }
            pr.println("");
//            sb.append("\n");
        }
        pr.close();
//        for (int i = 0; i < 8; i++) {
//            for (int o = 0; o < 8; o++) {
//
//            }
//        }
    }

    public void print() {
        System.out.println(sb);
    }
}
