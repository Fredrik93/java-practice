package org.example.leetcode.easy;

public class MergeNodeLists {
    public ListNode mergeNodes(ListNode head1, ListNode head2) {
        // loop over nodes
        ListNode currentFirstList = head1;
        ListNode currentSecondList = head2;
        ListNode resultNodes = null;
        while (currentFirstList != null && currentSecondList != null) {
            System.out.println(currentFirstList.val);
            System.out.println(currentSecondList.val);
            if (resultNodes == null) {
                resultNodes = new ListNode(currentFirstList.val);
                resultNodes.next = new ListNode(currentSecondList.val);
                currentFirstList = currentFirstList.next;
                currentSecondList = currentSecondList.next;

            } else {
                resultNodes = new ListNode(currentFirstList.val);
                resultNodes.next = new ListNode(currentSecondList.val);
                currentFirstList = currentFirstList.next;
                currentSecondList = currentSecondList.next;

            }

        }
        // store results in new node
        // return node

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
