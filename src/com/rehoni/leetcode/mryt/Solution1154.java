package com.rehoni.leetcode.mryt;

/**
 * 类<code>Doc</code>用于：1154. 一年中的第几天
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/21 8:27
 */
public class Solution1154 {
    public static void main(String[] args) {
        String date = "2019-01-09";
        int i = dayOfYear(date);
    }

    public static int dayOfYear(String date) {
        int[] size = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Integer year = Integer.valueOf(date.substring(0, 4));
        Integer month = Integer.valueOf(date.substring(5, 7));
        Integer day = Integer.valueOf(date.substring(8));
        int count = 0;
        for (int i = 1; i < month; i++) {
            count += size[i];
        }
        if (year % 4 == 0 && month > 2) {
            count += 1;
        }
        count += day;
        return count;
    }
}
