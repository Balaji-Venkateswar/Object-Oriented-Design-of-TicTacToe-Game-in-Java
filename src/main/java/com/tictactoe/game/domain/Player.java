package com.tictactoe.game.domain;

public class Player {


    private final String name;
    private char symbol;

    public Player(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

}
