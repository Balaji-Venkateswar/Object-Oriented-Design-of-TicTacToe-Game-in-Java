package com.tictactoe.game.service;

import com.tictactoe.game.domain.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinTest {

    Board board;
    @BeforeEach
    void init(){
        board = new Board(3);
    }

    @Test
    void testThatChecksWin1stColumn() {
        char playerSymbol = 'X';

        int[] [] playerMove1 = new int[][] {{0},{0}};
        int[] [] playerMove2 = new int[][] {{1},{0}};
        int[] [] playerMove3 = new int[][] {{2},{0}};

        char[][] boardMatrix = board.getBoardMatrix();
        boardMatrix [0][0] = 'X';
        boardMatrix [1][0] = 'X';
        boardMatrix [2][0] = 'X';

        Object[] currentBoard1 = new Object[]{boardMatrix, playerMove1};
        Object[] currentBoard2 = new Object[]{boardMatrix, playerMove2};
        Object[] currentBoard3 = new Object[]{boardMatrix, playerMove3};

        assertAll(
                () -> assertTrue(Win.checkWin(currentBoard1, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard2, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard3, playerSymbol))
        );

    }

    @Test
    void testThatChecksWin2ndColumn() {

        char playerSymbol = 'X';

        int[] [] playerMove1 = new int[][] {{0},{1}};
        int[] [] playerMove2 = new int[][] {{1},{1}};
        int[] [] playerMove3 = new int[][] {{2},{1}};

        char[][] boardMatrix = board.getBoardMatrix();
        boardMatrix [0][1] = 'X';
        boardMatrix [1][1] = 'X';
        boardMatrix [2][1] = 'X';

        Object[] currentBoard1 = new Object[]{boardMatrix, playerMove1};
        Object[] currentBoard2 = new Object[]{boardMatrix, playerMove2};
        Object[] currentBoard3 = new Object[]{boardMatrix, playerMove3};

        assertAll(
                () -> assertTrue(Win.checkWin(currentBoard1, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard2, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard3, playerSymbol))
        );

    }

    @Test
    void testThatChecksWin3rdColumn() {

        char playerSymbol = 'X';

        int[] [] playerMove1 = new int[][] {{0},{2}};
        int[] [] playerMove2 = new int[][] {{1},{2}};
        int[] [] playerMove3 = new int[][] {{2},{2}};

        char[][] boardMatrix = board.getBoardMatrix();
        boardMatrix [0][2] = 'X';
        boardMatrix [1][2] = 'X';
        boardMatrix [2][2] = 'X';

        Object[] currentBoard1 = new Object[]{boardMatrix, playerMove1};
        Object[] currentBoard2 = new Object[]{boardMatrix, playerMove2};
        Object[] currentBoard3 = new Object[]{boardMatrix, playerMove3};

        assertAll(
                () -> assertTrue(Win.checkWin(currentBoard1, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard2, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard3, playerSymbol))
        );

    }

    @Test
    void testThatChecksWin1stRow() {

        char playerSymbol = 'X';

        int[] [] playerMove1 = new int[][] {{0},{0}};
        int[] [] playerMove2 = new int[][] {{0},{1}};
        int[] [] playerMove3 = new int[][] {{0},{2}};

        char[][] boardMatrix = board.getBoardMatrix();
        boardMatrix [0][0] = 'X';
        boardMatrix [0][1] = 'X';
        boardMatrix [0][2] = 'X';

        Object[] currentBoard1 = new Object[]{boardMatrix, playerMove1};
        Object[] currentBoard2 = new Object[]{boardMatrix, playerMove2};
        Object[] currentBoard3 = new Object[]{boardMatrix, playerMove3};
        assertAll(
                () -> assertTrue(Win.checkWin(currentBoard1, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard2, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard3, playerSymbol))
        );

    }

    @Test
    void testThatChecksWin2ndRow() {

        char playerSymbol = 'X';

        int[] [] playerMove1 = new int[][] {{1},{0}};
        int[] [] playerMove2 = new int[][] {{1},{1}};
        int[] [] playerMove3 = new int[][] {{1},{2}};

        char[][] boardMatrix = board.getBoardMatrix();
        boardMatrix [1][0] = 'X';
        boardMatrix [1][1] = 'X';
        boardMatrix [1][2] = 'X';

        Object[] currentBoard1 = new Object[]{boardMatrix, playerMove1};
        Object[] currentBoard2 = new Object[]{boardMatrix, playerMove2};
        Object[] currentBoard3 = new Object[]{boardMatrix, playerMove3};
        assertAll(
                () -> assertTrue(Win.checkWin(currentBoard1, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard2, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard3, playerSymbol))
        );
    }

    @Test
    void testThatChecksWin3rdRow() {

        char playerSymbol = 'X';

        int[] [] playerMove1 = new int[][] {{2},{0}};
        int[] [] playerMove2 = new int[][] {{2},{1}};
        int[] [] playerMove3 = new int[][] {{2},{2}};

        char[][] boardMatrix = board.getBoardMatrix();
        boardMatrix [2][0] = 'X';
        boardMatrix [2][1] = 'X';
        boardMatrix [2][2] = 'X';

        Object[] currentBoard1 = new Object[]{boardMatrix, playerMove1};
        Object[] currentBoard2 = new Object[]{boardMatrix, playerMove2};
        Object[] currentBoard3 = new Object[]{boardMatrix, playerMove3};
        assertAll(
                () -> assertTrue(Win.checkWin(currentBoard1, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard2, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard3, playerSymbol))
        );
    }

    @Test
    void testThatChecksWinDiagonalLeft() {

        char playerSymbol = 'X';

        int[] [] playerMove1 = new int[][] {{0},{0}};
        int[] [] playerMove2 = new int[][] {{1},{1}};
        int[] [] playerMove3 = new int[][] {{2},{2}};

        char[][] boardMatrix = board.getBoardMatrix();
        boardMatrix [0][0] = 'X';
        boardMatrix [1][1] = 'X';
        boardMatrix [2][2] = 'X';

        Object[] currentBoard1 = new Object[]{boardMatrix, playerMove1};
        Object[] currentBoard2 = new Object[]{boardMatrix, playerMove2};
        Object[] currentBoard3 = new Object[]{boardMatrix, playerMove3};
        assertAll(
                () -> assertTrue(Win.checkWin(currentBoard1, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard2, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard3, playerSymbol))
        );

    }

    @Test
    void testThatChecksWinDiagonalRight() {

        char playerSymbol = 'X';

        int[] [] playerMove1 = new int[][] {{0},{2}};
        int[] [] playerMove2 = new int[][] {{1},{1}};
        int[] [] playerMove3 = new int[][] {{2},{0}};

        char[][] boardMatrix = board.getBoardMatrix();
        boardMatrix [0][2]= 'X';
        boardMatrix [1][1] = 'X';
        boardMatrix [2][0] = 'X';

        Object[] currentBoard1 = new Object[]{boardMatrix, playerMove1};
        Object[] currentBoard2 = new Object[]{boardMatrix, playerMove2};
        Object[] currentBoard3 = new Object[]{boardMatrix, playerMove3};
        assertAll(
                () -> assertTrue(Win.checkWin(currentBoard1, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard2, playerSymbol)),
                () -> assertTrue(Win.checkWin(currentBoard3, playerSymbol))
        );
    }

    @Test
    void testThatChecksForWinAndReturnsFalse() {

        char playerSymbol = 'X';

        int[] [] playerMove = new int[][] {{0},{0}};

        char[][] boardMatrix = board.getBoardMatrix();
        boardMatrix [0][0] = 'X';
        boardMatrix [0][1] = 'X';
        boardMatrix [0][2] = 'O';

        Object[] currentBoard = new Object[]{boardMatrix, playerMove};

        assertFalse(Win.checkWin(currentBoard, playerSymbol));
    }



}