package org.example.day17.task1;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println(ChessPiece.PAWN_WHINE);
        ChessPiece [][] coordies = new ChessPiece[][]{
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK,ChessPiece.EMPTY},
            {ChessPiece.EMPTY, ChessPiece.ROOK_WHINE, ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
            {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
            {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHINE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,},
            {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHINE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,},
            {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.BISHOP_WHINE, ChessPiece.PAWN_WHINE, ChessPiece.EMPTY, ChessPiece.EMPTY,},
            {ChessPiece.PAWN_WHINE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHINE, ChessPiece.EMPTY, ChessPiece.PAWN_WHINE},
            {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.ROOK_WHINE, ChessPiece.KING_WHITE, ChessPiece.EMPTY,},
        };

        ChessBoard chessBoard = new ChessBoard(coordies);
        chessBoard.print();


    }
}
