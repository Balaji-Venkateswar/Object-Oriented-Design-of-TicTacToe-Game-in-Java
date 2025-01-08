package com.tictactoe.game.service;

import com.tictactoe.game.domain.Player;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void testThatCreatesAndChecksThatPlayersArrayListAreEqual() {
        UserService userService = new UserService();
        String[] playerNames = new String[2];
        playerNames[0] = "John";
        playerNames[1] = "Sara";

        Player player1 = new Player(playerNames[0]);
        Player player2 = new Player(playerNames[1]);
        List<Player> expected = new ArrayList<>();
        expected.add(player1);
        expected.add(player2);

        assertIterableEquals(expected, userService.createPlayers(playerNames), "should create and return a List of players");
    }
}