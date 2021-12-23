package com.rehoni.leetcode.tag.hdck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 类<code>Doc</code>用于：438. 找到字符串中所有字母异位词
 * <p>
 * 用数组比map速度快
 * 用长度26的数组比用长度255的数组快
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/23 8:24
 */
public class Solution438 {
    public static void main(String[] args) {
        List<Integer> anagrams = findAnagramsWithArray("cbaebabacd", "abc");
        anagrams.forEach(System.out::println);
    }

    public static List<Integer> findAnagramsWithArray(String s, String p) {
        int len = p.length();
        int[] pMap = new int[255];
        int charNum = 0;
        for (char c : p.toCharArray()) {
            if (pMap[c] == 0) {
                charNum++;
            }
            pMap[c]++;
        }
        int l = 0;
        int r = 0;
        int valid = 0;
        int[] winMap = new int[255];
        List<Integer> res = new ArrayList<>();
        while (r < s.length()) {
            char c = s.charAt(r);
            if (pMap[c] != 0) {
                winMap[c]++;
                if (winMap[c] == pMap[c]) {
                    valid++;
                }
            }
            while (valid == charNum) {
                char d = s.charAt(l);
                if (r - l + 1 == len) {
                    res.add(l);
                }
                if (pMap[d] != 0) {
                    if (winMap[d] == pMap[d]) {
                        valid--;
                    }
                    winMap[d]--;
                }
                l++;
            }
            r++;
        }

        return res;
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int len = p.length();
        // 先用map存放p，记录p中各个单词的次数
        HashMap<Character, Integer> map = new HashMap<>(len);
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>(len);
        int l = 0;
        int r = 0;
        int valid = 0;
        List<Integer> res = new ArrayList<>();
        while (r < s.length()) {
            char c = s.charAt(r);
            if (map.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                // 如果窗口中该字符数量少于map中的数量，就说明验证没有问题
                if (window.get(c) <= map.get(c)) {
                    valid++;
                }
            }
            // 缩紧窗口
            while (valid == len) {
                char d = s.charAt(l);
                if (map.containsKey(d)) {
                    window.put(d, window.get(d) - 1);
                    if (window.get(d) < map.get(d)) {
                        valid--;
                    }
                }
                // 如果窗口长度和字符串长度匹配时，满足条件
                if (r - l + 1 == len) {
                    res.add(l);
                }
                l++;
            }
            r++;
        }
        return res;
    }
}
