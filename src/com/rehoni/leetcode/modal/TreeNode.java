package com.rehoni.leetcode.modal;

/**
 * 类<code>Doc</code>用于：二叉树模型
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/23 15:07
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

