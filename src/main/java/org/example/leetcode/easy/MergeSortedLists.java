package org.example.leetcode.easy;

import org.example.leetcode.medium.GreatestCommonDivisor;

public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        ListNode current = list1;
        while (current != null) {
            current = current.next;
            current.next = list2;

        }
        return list1;
    }


}
