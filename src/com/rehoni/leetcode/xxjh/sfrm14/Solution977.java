package com.rehoni.leetcode.xxjh.sfrm14;

/**
 * 类<code>Doc</code>用于：977. 有序数组的平方
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/14 18:58
 */
public class Solution977 {
    public static void main(String[] args) {
        System.out.println(sortedSquares(new int[]{-7, -3, 2, 3, 11}));
        System.out.println(sortedSquares(new int[]{-4,-1,0,3,10}));
    }

    public static int[] sortedSquares(int[] nums) {
        int l = 0;
        int len = nums.length;
        int r = len - 1;
        int[] res = new int[len];
        while (l <= r) {
            if (nums[l] * (-1) > nums[r]) {
                res[len - 1] = nums[l] * nums[l];
                l++;
                len--;
            } else {
                res[len - 1] = nums[r] * nums[r];
                r--;
                len--;
            }
        }
        return res;
    }
}
