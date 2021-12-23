package com.rehoni.leetcode.xxjh.sfrm14;

import com.rehoni.leetcode.modal.ListNode;

/**
 * 类<code>Doc</code>用于：19. 删除链表的倒数第 N 个结点
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/21 10:11
 */
public class Solution19 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        removeNthFromEnd(listNode, 2);
    }


    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hhead = new ListNode(0, head);
        int size = 0;
        ListNode tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }
        ListNode cur = hhead;
        for (int i = 1; i < size - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return hhead.next;
    }

    public static ListNode removeNthFromEnd3(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; ++i) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    public static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }
}
