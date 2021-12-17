package com.rehoni.leetcode.xxjh.sfrm;

/**
 * 类<code>Doc</code>用于：557. Reverse Words in a String III
 * 不用考虑首尾有问号的情况
 * 思路：模拟就行了
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/18 23:41
 */
public class Solution557 {
    public static void main(String[] args) {
        String s = "God Ding";
        Solution557 solution557 = new Solution557();
        String s1 = solution557.reverseWords(s);
        System.out.println(s1);
    }

    public String reverseWords(String s) {
        int l = 0;
        int r = 0;
        StringBuilder sb = new StringBuilder(s.length());
        while (r < s.length()) {
            if (s.charAt(r) == ' ') {
                for (int i = r - 1; i >= l; i--) {
                    sb.append(s.charAt(i));
                }
                sb.append(' ');
                l = r + 1;
            }
            r++;
        }
        for (int i = r - 1; i >= l; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
