package com.rehoni.leetcode.xxjh.sfrm;

import java.util.Arrays;

/**
 * 类<code>Doc</code>用于：189. 轮转数组
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/14 19:12
 */
public class Solution189 {
    /**
     * 方法<code>rotate</code>作用为：使用额外的数组来存储旋转后的情况
     *
     * @param nums
     * @param k
     * @return void
     * @throws
     * @author luohao
     * @date 2021/12/14 19:17
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }

    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            r--;
            l++;
        }
    }
}
