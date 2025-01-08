package com.tictactoe.game.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void setBoardMatrix() {

        int boardSize = 3;
        Board board = new Board(boardSize);

        int[][] playerMove = new int [][] {{0}, {0}};
        char playerSymbol = 'X';

        char[][] expectedBoardMatrix = board.getBoardMatrix();
        expectedBoardMatrix [playerMove[0][0]] [playerMove[1][0]] = playerSymbol;

        assertArrayEquals(expectedBoardMatrix, board.setBoardMatrix(playerMove, playerSymbol));

    }
}