package com.tictactoe.game.service;

import com.tictactoe.game.domain.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;



class BoardServiceTest {

    BoardService boardService;
    @BeforeEach
    void init(){
       boardService = new BoardService();
    }

    @Test
    void testThatcreatesandReturnsBoardObject() {
        int boardSize = 3;
        Board expected = new Board(boardSize);
        assertEquals(expected.getClass(), boardService.createBoard(boardSize).getClass());
    }

    @Test
    void testThatgetsMoveFromPlayer() {

        int boardSize = 3;
        Board board = boardService.createBoard(boardSize);

        HashMap<Integer,int[][]> map = new HashMap<>();
        map.put(1,new int[][] {{0},{0}});
        map.put(2, new int[][] {{0},{1}});
        map.put(3, new int[][] {{0},{2}});
        map.put(4, new int[][] {{1},{0}});
        map.put(5, new int[][] {{1},{1}});
        map.put(6, new int[][] {{1},{2}});
        map.put(7, new int[][] {{2},{0}});
        map.put(8, new int[][] {{2},{1}});
        map.put(9, new int[][] {{2},{2}});


        String PlayerSelectedPosition = "5";
        char[][] boardDisplay = board.setBoardMatrix(map.get((Integer.parseInt(PlayerSelectedPosition))), 'X');
        Object[] expected = new Object[]{boardDisplay, map.get(5)};

        provideInput(PlayerSelectedPosition);

        assertArrayEquals(expected, boardService.getMove("John", 'X', map));

    }


    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }


}