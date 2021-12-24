package com.rehoni.leetcode.xxjh.sfrm14;

/**
 * 类<code>Doc</code>用于: 567. 字符串的排列
 * 既然只要包含 s1 的排列，意味着没有顺序要求，故比较哈希即可
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/23 14:42
 */
public class Solution567 {
    public static void main(String[] args) {
        boolean b = checkInclusion("ab", "eidbaooo");
        System.out.println(b);
    }

    public static boolean checkInclusion(String s1, String s2) {
        // 获得 s1 的字符串统计数组
        int[] needMap = new int[256];
        for (char c : s1.toCharArray()) {
            needMap[c]++;
        }
        int l = 0;
        int r = 0;
        int valid = 0;
        int[] winMap = new int[256];
        while (r < s2.length()) {
            char c = s2.charAt(r);
            if (needMap[c] != 0) {
                winMap[c]++;
                if (winMap[c] <= needMap[c]) {
                    valid++;
                }
            }
            while (valid == s1.length()) {
                char d = s2.charAt(l);
                if (needMap[d] != 0) {
                    winMap[d]--;
                    if (winMap[d] < needMap[d]) {
                        valid--;
                    }
                }
                if (r - l + 1 == s1.length()) {
                    return true;
                }
                l++;
            }
            r++;
        }
        return false;
    }
}
