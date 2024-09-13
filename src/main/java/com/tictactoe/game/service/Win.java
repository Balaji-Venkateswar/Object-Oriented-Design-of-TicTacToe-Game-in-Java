package com.tictactoe.game.service;

public class Win {

    public static boolean checkWin(Object[] currentBoard, char symbol){
        char[] [] boardDisplay = (char[][]) currentBoard[0];
        int[][] boardMove = (int[][]) currentBoard[1];

        if ((boardMove[0][0] == 0)  && (boardMove[1][0] == 0)) {
            if (boardDisplay[0][1] == symbol)
                if (boardDisplay[0][2] == symbol)
                    return true;
            if (boardDisplay[1][0] == symbol)
                if (boardDisplay[2][0] == symbol)
                    return true;
            if (boardDisplay[1][1] == symbol)
                if (boardDisplay[2][2] == symbol)
                    return true;
        }

        if ((boardMove[0][0] == 0)  && (boardMove[1][0] == 1)) {
            if (boardDisplay[1][1] == symbol)
                if (boardDisplay[2][1] == symbol)
                    return true;
            if (boardDisplay[0][0] == symbol)
                if (boardDisplay[0][2] == symbol)
                    return true;
        }

        if ((boardMove[0][0] == 0)  && (boardMove[1][0] == 2)) {
            if (boardDisplay[0][1] == symbol)
                if (boardDisplay[0][0] == symbol)
                    return true;
            if (boardDisplay[1][2] == symbol)
                if (boardDisplay[2][2] == symbol)
                    return true;
            if (boardDisplay[1][1] == symbol)
                if (boardDisplay[2][0] == symbol)
                    return true;
        }

        if ((boardMove[0][0] == 1)  && (boardMove[1][0] == 0)) {
            if (boardDisplay[0][0] == symbol)
                if (boardDisplay[2][0] == symbol)
                    return true;
            if (boardDisplay[1][1] == symbol)
                if (boardDisplay[1][2] == symbol)
                    return true;
        }

        if ((boardMove[0][0] == 1)  && (boardMove[1][0] == 1)) {
            if (boardDisplay[0][0] == symbol)
                if (boardDisplay[2][2] == symbol)
                    return true;
            if (boardDisplay[0][2] == symbol)
                if (boardDisplay[2][0] == symbol)
                    return true;
            if (boardDisplay[0][1] == symbol)
                if (boardDisplay[2][1] == symbol)
                    return true;
            if (boardDisplay[1][0] == symbol)
                if (boardDisplay[2][1] == symbol)
                    return true;
        }
        if ((boardMove[0][0] == 1)  && (boardMove[1][0] == 2)) {
            if (boardDisplay[0][2] == symbol)
                if (boardDisplay[2][2] == symbol)
                    return true;
            if (boardDisplay[1][0] == symbol)
                if (boardDisplay[1][1] == symbol)
                    return true;
        }


        if ((boardMove[0][0] == 2)  && (boardMove[1][0] == 0)) {
            if (boardDisplay[1][0] == symbol)
                if (boardDisplay[0][0] == symbol)
                    return true;
            if (boardDisplay[2][1] == symbol)
                if (boardDisplay[2][2] == symbol)
                    return true;
            if (boardDisplay[1][1] == symbol)
                if (boardDisplay[0][2] == symbol)
                    return true;
        }

        if ((boardMove[0][0] == 2)  && (boardMove[1][0] == 1)) {
            if (boardDisplay[2][0] == symbol)
                if (boardDisplay[2][2] == symbol)
                    return true;
            if (boardDisplay[0][1] == symbol)
                if (boardDisplay[1][1] == symbol)
                    return true;
        }

        if ((boardMove[0][0] == 2)  && (boardMove[1][0] == 2)) {
            if (boardDisplay[0][2] == symbol)
                if (boardDisplay[1][2] == symbol)
                    return true;
            if (boardDisplay[2][0] == symbol)
                if (boardDisplay[2][1] == symbol)
                    return true;
            if (boardDisplay[0][0] == symbol)
                if (boardDisplay[1][1] == symbol)
                    return true;
        }

        return false;

    }

}
