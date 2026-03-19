package org.example.leetcode.easy;

import org.example.leetcode.medium.GreatestCommonDivisor;

//Should learn this
public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode current = list1;
        while (current != null) {
            System.out.println("list 1: " + current.val);
            System.out.println("list 2 :" +  list2.val);
            current = current.next;
            list2 = list2.next;
        }
        return list1;
    }


}
