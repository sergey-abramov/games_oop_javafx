package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length - 1; i++) {
            if (board[i][i] == 1) {
                for (int j = 0; j < board.length - 1; j++) {
                    if (board[i][j] != 1) {
                        rsl = (board[j][i] == 1);
                        break;
                    }
                }
            }
        }
        return rsl;
    }
}
