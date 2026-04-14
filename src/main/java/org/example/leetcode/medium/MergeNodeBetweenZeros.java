package org.example.leetcode.medium;

public class MergeNodeBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        Hi hi = new Hi();
        int h = hi.getH();
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

    public class Hi {
        int h;

        public Hi() {
        }

        public int getH() {
            return 2;
        }
    }
}
