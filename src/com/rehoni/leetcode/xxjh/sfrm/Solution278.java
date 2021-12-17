package com.rehoni.leetcode.xxjh.sfrm;

/**
 * 类<code>Doc</code>用于：278. 第一个错误的版本
 *
 * 查找左边界，收缩右边界。
 * @author luohao
 * @version 1.0
 * @date 2021/12/14 15:26
 */
public class Solution278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(11));
        System.out.println(firstBadVersion(19));
        System.out.println(firstBadVersion(33));
    }

    public static int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static boolean isBadVersion(int x) {
        if (x <= 5) {
            return false;
        } else {
            return true;
        }

    }
}
