package com.rehoni.leetcode.xxjh.jzoffer31;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 类<code>Doc</code>用于：剑指 Offer 30. 包含min函数的栈
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/14 14:50
 */
public class JzOffer30 {
    Deque<Integer> store;
    Deque<Integer> minStore;

    /**
     * initialize your data structure here.
     */
    public JzOffer30() {
        store = new LinkedList<>();
        minStore = new LinkedList<>();
    }

    public void push(int x) {
        store.push(x);
        if (minStore.isEmpty() || x <= minStore.peek()) {
            minStore.push(x);
        }
    }

    public void pop() {
        if (store.pop().equals(minStore.peek())) {
            minStore.pop();
        }
    }

    public int top() {
        return store.peek();
    }

    public int min() {
        return minStore.peek();
    }
}
