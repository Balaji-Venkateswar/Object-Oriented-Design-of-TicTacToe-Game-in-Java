package com.tictactoe.game.service;

import com.tictactoe.game.domain.Board;

import java.util.HashMap;
import java.util.Scanner;

public class BoardService {

    Board board;

    public Board createBoard(int boardSize){
        this.board = new Board(boardSize);
        return board;
    }

    public Object[]  getMove(String name, char playerSymbol, HashMap<Integer,int[][]> map) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print(name + " enter the position in the board (range: 1-9): ");
            String input = scan.next();
            int value;
            try {
                value = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter only a number");
                continue;
            }

            if (map.get(value) == null) {
                System.out.println("The position is already filled");
                continue;
            }
            int[][] p1Position = map.get(value);
            map.remove(value);
            char[][] boardDisplay = board.setBoardMatrix(p1Position, playerSymbol);

            System.out.println("|" + boardDisplay[0][0] + "|" + boardDisplay[0][1] + "|" + boardDisplay[0][2] + "|");
            System.out.println("|" + boardDisplay[1][0] + "|" + boardDisplay[1][1] + "|" + boardDisplay[1][2] + "|");
            System.out.println("|" + boardDisplay[2][0] + "|" + boardDisplay[2][1] + "|" + boardDisplay[2][2] + "|");
            return new Object[]{boardDisplay, p1Position};
        }
    }







}
