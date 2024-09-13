package com.tictactoe.game.domain;
import java.util.HashMap;

public class BoardMap3x3 implements IBoardmap {

    HashMap<Integer, int[][]> map = new HashMap<>();


    @Override
    public HashMap<Integer, int[][]> createmap() {

        map.put(1,new int[][] {{0},{0}});
        map.put(2, new int[][] {{0},{1}});
        map.put(3, new int[][] {{0},{2}});
        map.put(4, new int[][] {{1},{0}});
        map.put(5, new int[][] {{1},{1}});
        map.put(6, new int[][] {{1},{2}});
        map.put(7, new int[][] {{2},{0}});
        map.put(8, new int[][] {{2},{1}});
        map.put(9, new int[][] {{2},{2}});

        return map;
    }
}
