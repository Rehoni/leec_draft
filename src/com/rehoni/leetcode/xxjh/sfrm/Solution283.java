package com.rehoni.leetcode.xxjh.sfrm;

/**
 * 类<code>Doc</code>用于：283. 移动零
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/14 19:26
 */
public class Solution283 {
    public static void main(String[] args) {
        int[] ints1 = {0, 1, 0, 3, 12};
        // moveZeroes(ints1);
        moveZeroes2(ints1);
        int[] ints2 = {1, 1, 1, 0, 1, 0, 3, 12};
        // moveZeroes(ints2);
        moveZeroes2(ints2);
        System.out.println(ints1);
        System.out.println(ints2);
    }

    public static void moveZeroes2(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }

    public static void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            if (nums[r] != 0) {
                swap(nums, l, r);
                l++;
            }
            r++;
        }
    }

    public static void swap(int[] nums, int i, int k) {
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
    }
}
