package com.rehoni.leetcode.mryt;

/**
 * 类<code>Doc</code>用于：686. 重复叠加字符串匹配
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/22 19:55
 */
public class Solution686 {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        int max = 2 * a.length() + b.length();
        while (sb.length() < max) {
            sb.append(a);
            ans++;
            if (sb.toString().contains(b)) {
                return ans;
            }
        }
        return -1;
    }
}
