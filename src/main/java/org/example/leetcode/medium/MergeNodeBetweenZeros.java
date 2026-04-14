package org.example.leetcode.medium;

public class MergeNodeBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        //iterate over nodes and check for 0
        // if 0 is found, start summing integers until 0 is found again
        // add sum as a node to a new ListNode
        // return new ListNode as result
        return null;
    }

    public static class ListNode {
        int val;
        public ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
