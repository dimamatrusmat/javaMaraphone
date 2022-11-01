package org.example.day17.task1;

public class ChessBoard {
    private StringBuilder sb = new StringBuilder("");

    public ChessBoard(float[][] floats) {

        for (int i = 0; i < 8; i++) {
            for (int o = 0; o < 8; o++) {
                sb.append(ChessPiece.EMPTY);
            }
            sb.append("\n");
        }
    }

    public void print() {
        System.out.println(sb);
    }
}
