package org.example.leetcode.medium;

public class GreatestCommonDivisor
{
    public ListNode insertGreatestCommonDivisors(ListNode head)
    {
        ListNode resultList = new ListNode(0);
        ListNode tail = resultList;
        // loop over listnode head
        while(head != null && head.next != null)
        {
            ListNode current = head;
            ListNode next = current.next;

            System.out.println(current.val + " " + next.val);
            // find the curr and next nodes value
            int currVal = current.val;
            int nextVal = next.val;
            // find the greatest common divisor
            int gcd = findGreatestCommonDivisor(currVal, nextVal);
            // add curr, gcd and next to next listnode result
            tail.next = new ListNode(currVal);
            tail = tail.next;

            tail.next = new ListNode(gcd);
            tail = tail.next;

            head = head.next;
            // return result
        }
        if (head != null) {
            tail.next = new ListNode(head.val);
        }
        return resultList.next;
    }

    private int findGreatestCommonDivisor(int curr, int next)
    {
        //gcd can at most be the same as the smallest of curr and next.
        // e.g., curr = 6 next = 12 then we cant have gcd 12 becase that would mean 6 / 12 = 0.5 which is not an integer
        int gcd = Math.min(curr, next);
        while(gcd > 0)
        {
            if(curr % gcd == 0 && next % gcd == 0)
            {
                return gcd;
            }
            else
            {
                gcd--;
            }

        }
        return gcd;
    }

    public class ListNode
    {
        public int val;
        public ListNode next;

        public ListNode()
        {
        }

        public ListNode(int val)
        {
            this.val = val;
        }

        public ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }

}
