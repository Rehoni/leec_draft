package com.rehoni.leetcode.mryt;

/**
 * 类<code>Doc</code>用于：807. Max Increase to Keep City Skyline
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/13 9:52
 */
public class Solution807 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(maxIncreaseKeepingSkyline2(grid));
    }

    public static int maxIncreaseKeepingSkyline2(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return ans;
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        // 遍历找到两个最大数组
        // 横向
        int[] hds = new int[grid.length];
        // 竖直方向
        int[] ids = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int max = grid[i][0];
            for (int j = 0; j < grid[0].length; j++) {
                int val = grid[i][j];
                if (max < grid[i][j]) {
                    max = val;
                }
            }
            hds[i] = max;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int max = grid[0][i];
            for (int j = 0; j < grid.length; j++) {
                int val = grid[j][i];
                if (max < grid[j][i]) {
                    max = val;
                }
            }
            ids[i] = max;
        }
        //
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int val = grid[i][j];
                int min = ids[j] > hds[i] ? hds[i] : ids[j];
                count += (min - val);
            }
        }
        return count;
    }
}
