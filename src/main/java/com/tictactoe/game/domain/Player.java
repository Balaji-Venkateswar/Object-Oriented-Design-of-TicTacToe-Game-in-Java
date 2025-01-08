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


    @Override
    public boolean equals(Object O) {

        if(O == null || getClass() != O.getClass())
            return false;
        Player that = (Player) O;
        if (this.name.equals(that.name) && this.symbol == that.symbol)
            return true;

        return false;
    }

}
