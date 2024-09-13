package com.tictactoe.game.domain;

import java.util.HashMap;

public class Board {

    int boardSize;
    private final char[][] boardMatrix;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        boardMatrix = new char[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                boardMatrix[i][j] = '-';
            }
        }
    }

    public char[][] getBoardMatrix() {
        return boardMatrix;
    }

    public char[][] setBoardMatrix(int[][] move, char symbol) {
        boardMatrix [move[0][0]] [move[1][0]] = symbol;
        return boardMatrix;
    }

}
