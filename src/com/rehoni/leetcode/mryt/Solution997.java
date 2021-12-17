package com.rehoni.leetcode.mryt;

import com.rehoni.leetcode.xxjh.sfrm.Solution557;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 类<code>Doc</code>用于：997. 找到小镇的法官
 * 存在所有人指向法官，并且法官不指向任何人的情况。
 * 只要找到trust里边，没有指向别人的那个人，如果有一定是法官，如果没有就没有法官。
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/19 20:40
 */
public class Solution997 {
    public static void main(String[] args) {
        Solution997 solution997 = new Solution997();
        // String s1 = solution997.findJudge();
    }

    public int findJudge(int n, int[][] trust) {
        int res = -1;
        int[] in = new int[n + 1];
        int[] out = new int[n + 1];
        for (int[] ts : trust) {
            in[ts[0]]++;
            out[ts[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (in[i] == 0 && out[i] == n - 1){
                res = i;
            }
        }
        return res;
    }
}
