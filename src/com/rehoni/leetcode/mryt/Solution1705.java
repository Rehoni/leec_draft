package com.rehoni.leetcode.mryt;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 类<code>Doc</code>用于：TODO 1705. 吃苹果的最大数目
 * 感觉应该跟之前的课程表类似
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/24 14:17
 */
public class Solution1705 {
    public static void main(String[] args) {

    }

    public static int eatenApples(int[] apples, int[] days) {
        int res = 0;
        int stack = 0;
        int len = apples.length;
        int i = 0;
        while (i < len) {
            int apple = apples[i];
            stack += apple;
            // 吃苹果
            if (stack > 1) {
                stack--;
                res++;
            }
            int day = days[i];
            i++;
        }

        return res;
    }
}
