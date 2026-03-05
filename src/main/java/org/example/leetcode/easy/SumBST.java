package org.example.leetcode.easy;

import java.util.*;
import java.util.stream.Collectors;

public class SumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> listOfValues = getValues(root);
        return listOfValues.stream()
                .filter(number -> number >= low && number <= high)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public List<Integer> getValues(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(getValues(root.left));
        list.addAll(getValues(root.right));
        return list;
    }
}
