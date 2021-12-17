package com.rehoni.leetcode.mryt;

/**
 * 类<code>Doc</code>用于：419. 甲板上的战舰
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/18 22:51
 */
public class Solution419 {
    public static void main(String[] args) {
        char[][] board = new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        int i = countBattleships(board);
        System.out.println(i);
    }

    public static int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (j > 0 && board[i][j - 1] == 'X') continue;
                if (i > 0 && board[i - 1][j] == 'X') continue;
                if (board[i][j] == 'X') count++;
            }
        }
        return count;
    }
}
