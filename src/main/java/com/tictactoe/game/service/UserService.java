package com.tictactoe.game.service;

import com.tictactoe.game.domain.Player;

import java.util.ArrayList;
import java.util.List;

public class UserService {


    private final List<Player> players = new ArrayList<>();

    public List<Player> createPlayers(String[] playerNames){
        Player player1 = new Player(playerNames[0]);
        Player player2 = new Player(playerNames[1]);
        players.add(player1);
        players.add(player2);
        return players;
    }

    public void assignSymbols(char[] symbols){
        players.getFirst().setSymbol(symbols[0]);
        players.get(1).setSymbol(symbols[1]);
    }


}
