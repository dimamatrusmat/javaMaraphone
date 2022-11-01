package org.example.day17.task1;

public class ChessBoard {
    private StringBuilder sb = new StringBuilder("");

    public ChessBoard(ChessPiece [][] coordies){

        for (ChessPiece [] cp: coordies) {
            for (ChessPiece c: cp) {
                sb.append(c.getFigure());
            }
            sb.append("\n");
        }

    }

    public void print() {
        System.out.printf("%S",sb);
    }
}
