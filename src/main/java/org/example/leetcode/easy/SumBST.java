package org.example.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class SumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
       // iterate the tree
        int sum =0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
       // if between low or high add to sum
       // return
      return -1;
    }
}
