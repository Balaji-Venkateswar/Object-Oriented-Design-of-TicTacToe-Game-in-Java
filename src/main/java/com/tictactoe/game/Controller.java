package com.tictactoe.game;

import com.tictactoe.game.domain.Player;
import com.tictactoe.game.service.GameplayService;
import com.tictactoe.game.service.UserService;

import java.util.*;


public class Controller {

    private static final UserService userService = new UserService();
    private static final GameplayService gameplayService = new GameplayService();

    public static void main(String[] args) throws InterruptedException {


        Scanner scan = new Scanner(System.in);
        System.out.println("Starting Game");
        Thread.sleep(1000);

        String[] playerNames = new String[2];
        System.out.print("Enter the first player name: ");
        playerNames[0] = scan.next();
        System.out.print("Enter the second player name: ");
        playerNames[1] = scan.next();
        List<Player> players = userService.createPlayers(playerNames);


        char[] symbols = new char[2];
        System.out.print(players.getFirst().getName() + " enter your symbol ");
        symbols[0] = scan.next().charAt(0);
        System.out.print(players.get(1).getName() + " enter your symbol ");
        symbols[1] = scan.next().charAt(0);
        userService.assignSymbols(symbols);

        System.out.println("The default board size is 3");
        int boardSize = 3;
        gameplayService.startGame(players, boardSize);

    }







}
