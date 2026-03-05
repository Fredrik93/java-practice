package org.example.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class SumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        // iterate the tree
        int sum = levelOrder(root, low, high);

        // if between low or high add to sum
        // return
        return sum;
    }

    // Breadth first search
    public int levelOrder(TreeNode root, int low, int high) {
        if (root == null) return -1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            int currVal = current.val;

            if (currVal >= low && currVal <= high) {
                sum += currVal;
            }
            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }

        }
        return sum;
    }

}
