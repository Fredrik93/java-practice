package leetcode.medium;

import org.example.leetcode.medium.MergeNodeBetweenZeros;
import org.junit.jupiter.api.Test;

public class MergeNodeBetweenZerosTest {

   private MergeNodeBetweenZeros mnbz = new MergeNodeBetweenZeros();

   @Test
   void testOk(){
       MergeNodeBetweenZeros.ListNode head = new MergeNodeBetweenZeros.ListNode(0);
       MergeNodeBetweenZeros.ListNode n2 = new MergeNodeBetweenZeros.ListNode(3);
       MergeNodeBetweenZeros.ListNode n3 = new MergeNodeBetweenZeros.ListNode(1);
       MergeNodeBetweenZeros.ListNode n4 = new MergeNodeBetweenZeros.ListNode(0);
       MergeNodeBetweenZeros.ListNode n5 = new MergeNodeBetweenZeros.ListNode(4);
       MergeNodeBetweenZeros.ListNode n6 = new MergeNodeBetweenZeros.ListNode(5);
       MergeNodeBetweenZeros.ListNode n7 = new MergeNodeBetweenZeros.ListNode(2);
       MergeNodeBetweenZeros.ListNode n8 = new MergeNodeBetweenZeros.ListNode(0);
       head.next = n2;
       n2.next = n3;
       n3.next = n4;
       n4.next = n5;
       n5.next = n6;
       n6.next = n7;
       n7.next = n8;
       MergeNodeBetweenZeros.ListNode result = mnbz.mergeNodes(head);
   }


}
