package com.rehoni.leetcode.xxjh.jzoffer31;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 类<code>Doc</code>用于：剑指 Offer 09. 用两个栈实现队列
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/14 11:27
 */
public class JzOffer09 {
    Deque<Integer> store;
    Deque<Integer> remove;

    public JzOffer09() {
        store = new LinkedList<>();
        remove = new LinkedList<>();
    }

    public void appendTail(int value) {
        store.push(value);
    }

    public int deleteHead() {
        if (remove.isEmpty()) {
            // 将 store 取出存放到 remove 中
            while (!store.isEmpty()) {
                Integer pop = store.pop();
                remove.push(pop);
            }
        }
        if (remove.isEmpty()) {
            return -1;
        } else {
            return remove.pop();
        }
    }
}
