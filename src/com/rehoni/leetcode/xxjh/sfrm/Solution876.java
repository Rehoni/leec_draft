package com.rehoni.leetcode.xxjh.sfrm;

import com.rehoni.leetcode.modal.ListNode;

/**
 * 类<code>Doc</code>用于：TODO
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/21 8:47
 */
public class Solution876 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode1 = middleNode(listNode);
    }

    public static ListNode middleNode2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode middleNode(ListNode head) {
        ListNode res = head;
        int count = 0;
        while (head.next != null) {
            count++;
            head = head.next;
        }
        int index = 0;
        if (count % 2 == 0) {
            index = count / 2;
        } else {
            index = count / 2 + 1;
        }
        while (index > 0) {
            res = res.next;
            index--;
        }
        return res;
    }
}
