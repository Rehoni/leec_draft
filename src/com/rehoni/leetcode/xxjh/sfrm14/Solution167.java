package com.rehoni.leetcode.xxjh.sfrm14;

/**
 * 类<code>Doc</code>用于：167. Two Sum II - Input Array Is Sorted
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/17 13:57
 */
public class Solution167 {
    public int[] twoSum2(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{-1,-1};
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int l = 0; l < numbers.length; l++) {
            for (int r = l + 1; ; r++) {
                if (numbers[r] + numbers[l] == target) {
                    return new int[]{l, r};
                }
            }
        }
        return new int[0];
    }
}
