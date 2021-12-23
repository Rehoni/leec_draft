package com.rehoni.leetcode.xxjh.sfrm14;

/**
 * 类<code>Doc</code>用于：3. 无重复字符的最长子串
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/23 8:20
 */
public class Solution3 {
    public static void main(String[] args) {
        int a = lengthOfLongestSubstring("abcabcbb");
        System.out.println(a);
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] sMap = new int[26];
        for (char c : s.toCharArray()) {
            sMap[c - 'a']++;
        }
        int[] winMap = new int[26];
        int l = 0;
        int r = 0;
        int max = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            winMap[c - 'a']++;
            while (winMap[c - 'a'] > 1) {
                char d = s.charAt(l);
                l++;
                winMap[d - 'a']--;
            }
            max = Math.max(r - l + 1, max);
            r++;
        }
        return max;
    }
}
