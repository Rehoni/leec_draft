package com.rehoni.leetcode.xxjh.sfrm;

import java.util.Arrays;

/**
 * 类<code>Doc</code>用于：344. 反转字符串
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/17 16:08
 */
public class Solution344 {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        Solution344 solution344 = new Solution344();
        solution344.reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            l++;
            r--;
        }
    }
}
