package com.rehoni.leetcode.mryt;

import com.rehoni.leetcode.modal.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 类<code>Doc</code>用于： 1609. 奇偶树
 * BFS的变体
 * @author luohao
 * @version 1.0
 * @date 2021/12/25 20:29
 */
public class Solution1609 {
    public static void main(String[] args) {
        boolean evenOddTree = isEvenOddTree(new TreeNode(5, new TreeNode(4, new TreeNode(3, null, null), new TreeNode(3, null, null)),
                new TreeNode(2, new TreeNode(7, null, null), null)));
        System.out.println(evenOddTree);
    }

    public static boolean isEvenOddTree(TreeNode root) {
        boolean result = true;
        // 层次遍历 BFS
        if (root == null) {
            return false;
        }
        int level = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty() && result) {
            int len = queue.size();
            int left;
            if (level % 2 == 0) {
                left = -1;
            } else {
                left = Integer.MAX_VALUE;
            }
            int i = 0;
            while (i < len && result) {
                // 出队列
                TreeNode p = queue.pop();
                int right = p.val;
                if (level % 2 == 0) {
                    // 如果level是偶数, 节点值是奇数, 并且从左到右严格递增
                    result = right % 2 != 0 && right > left;
                } else {
                    // 如果level是奇数，节点值是偶数, 并且从左到右严格递减
                    result = right % 2 == 0 && right < left;
                }
                if (p.left != null) {
                    queue.add(p.left);
                }
                if (p.right != null) {
                    queue.add(p.right);
                }
                left = right;
                i++;
            }
            level++;
        }
        return result;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> numList = new LinkedList<>();
        queue.add(root);
        numList.add(root.val);
        while (!queue.isEmpty()) {
            // 保存这一层的元素
            result.add(numList);
            numList = new LinkedList<>();
            // 记录当前层有多少元素（遍历当前层，再添加下一层）
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                // 出队列
                TreeNode p = queue.pop();
                if (p.left != null) {
                    queue.add(p.left);
                    numList.add(p.left.val);
                }
                if (p.right != null) {
                    queue.add(p.right);
                    numList.add(p.right.val);
                }
            }
        }
        return result;
    }
}
