package org.example.day17.task1;

public enum ChessPiece {
    KING_WHITE(100, "♚"), KING_BLACK(100, "♔"),
    QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHINE(5, "♖"), ROOK_BLACK(5, "♜"),
    BISHOP_WHINE(3.5, "♗"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_WHINE(3, "♘"), KNIGHT_BLACK(3, "♞"),
    PAWN_WHINE(1, "♙"), PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");

    private double scil;
    private String figure;

    private ChessPiece (double scil, String figure) {
        this.figure = figure;
        this.scil = scil;
    }

    public double getScil() {
        return scil;
    }

    public String getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return figure;
    }
}
