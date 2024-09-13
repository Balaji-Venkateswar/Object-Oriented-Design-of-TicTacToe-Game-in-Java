package com.tictactoe.game.service;

import com.tictactoe.game.domain.Board;
import com.tictactoe.game.domain.BoardMap3x3;
import com.tictactoe.game.domain.IBoardmap;
import com.tictactoe.game.domain.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GameplayService {


    private final BoardService boardService = new BoardService();
    private final IBoardmap boardmap = new BoardMap3x3();


    public void startGame(List<Player> players, int boardSize){

        String player1 = players.getFirst().getName();
        char player1Symbol = players.getFirst().getSymbol();
        String player2 = players.get(1).getName();
        char player2Symbol = players.get(1).getSymbol();

        Board board = boardService.createBoard(boardSize);
        HashMap<Integer,int[][]> map = boardmap.createmap();


        // ask the players to make a move
        int i = 0;
        while (true) {
            Object[] boardAfterP1 = boardService.getMove(player1, player1Symbol, map);
            boolean isWinP1 = Win.checkWin(boardAfterP1, player1Symbol);
            if (isWinP1)
            {
                System.out.println(player1 + " is the winner");
                break;
            }
            if (i < 4)
            {
                Object[] boardAfterP2 = boardService.getMove(player2, player2Symbol, map);
                boolean isWinP2 = Win.checkWin(boardAfterP2, player2Symbol);
                if (isWinP2)
                {
                    System.out.println(player2 + " is the winner");
                    break;
                }
                i++;
            }
            else
            {
                System.out.println("The match is drawn");
                break;
            }
        }
    }



    }



