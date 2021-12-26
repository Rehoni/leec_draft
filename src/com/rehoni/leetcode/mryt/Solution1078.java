package com.rehoni.leetcode.mryt;

import java.util.ArrayList;

/**
 * 类<code>Doc</code>用于：1078. Bigram 分词
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/26 23:39
 */
public class Solution1078 {

    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        ArrayList<String> results = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            if (i + 2 < words.length && words[i].equals(first) && words[i + 1].equals(second)) {
                results.add(words[i + 2]);
            }
            i++;
        }
        return results.toArray(new String[0]);
    }
}
