package com.tictactoe.game.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BoardMap3x3Test {

    @Test
    void testThatCreatesHashMap() {
        BoardMap3x3 boardMap = new BoardMap3x3();

        HashMap<Integer, int[][]> expectedMap = new HashMap<>();
        expectedMap.put(1,new int[][] {{0},{0}});
        expectedMap.put(2, new int[][] {{0},{1}});
        expectedMap.put(3, new int[][] {{0},{2}});
        expectedMap.put(4, new int[][] {{1},{0}});
        expectedMap.put(5, new int[][] {{1},{1}});
        expectedMap.put(6, new int[][] {{1},{2}});
        expectedMap.put(7, new int[][] {{2},{0}});
        expectedMap.put(8, new int[][] {{2},{1}});
        expectedMap.put(9, new int[][] {{2},{2}});

        HashMap<Integer, int[][]> actualMap = boardMap.createmap();

        boolean mapsAreEqual = expectedMap.entrySet().stream()
                .allMatch(entry -> {
                    int key = entry.getKey();
                    int[][] expectedValue = entry.getValue();
                    int[][] actualValue = actualMap.get(key);
                    return Arrays.deepEquals(expectedValue, actualValue);
                });

        assertTrue(mapsAreEqual, "The maps are not equal");


    }
}