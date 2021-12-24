package com.rehoni.leetcode.tag.binarytree;

import com.rehoni.leetcode.modal.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类<code>Doc</code>用于：TODO 257. 二叉树的所有路径
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/23 15:06
 */
public class Solution257 {
    public static void main(String[] args) {
        Solution257 solution257 = new Solution257();
        solution257.binaryTreePaths(new TreeNode(1,new TreeNode(2,null,null),new TreeNode(3,null,null)));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder path = new StringBuilder();
        List<String> paths = new ArrayList<>();
        dfs(root, path, paths);
        return paths;
    }

    public void dfs(TreeNode p, StringBuilder path, List<String> paths) {
        if (p == null) {
            return;
        }
        path.append(p.val);
        if (p.left == null && p.right == null) {
            paths.add(path.toString());
        } else {
            path.append("->");
            dfs(p.left, path, paths);
            dfs(p.right, path, paths);
        }
    }
}
