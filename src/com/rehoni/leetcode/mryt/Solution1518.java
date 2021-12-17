package com.rehoni.leetcode.mryt;

/**
 * 类<code>Doc</code>用于：1518. Water Bottles
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/17 13:44
 */
public class Solution1518 {

    public static int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            int toDrink = empty / numExchange;
            empty = empty % numExchange;
            count += toDrink;
            empty = toDrink + empty;
        }
        return count;
    }
}
