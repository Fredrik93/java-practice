package leetcode.easy;

import org.example.leetcode.easy.MergeNodeLists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeNodeListsTest {
    private MergeNodeLists mn = new MergeNodeLists();
    @Test
    void testOk(){
        // list 1
        MergeNodeLists.ListNode h1 = new MergeNodeLists.ListNode(1);
        MergeNodeLists.ListNode n1 = new MergeNodeLists.ListNode(2);
        MergeNodeLists.ListNode n2 = new MergeNodeLists.ListNode(4);

        // list 2
        MergeNodeLists.ListNode h2 = new MergeNodeLists.ListNode(1);
        MergeNodeLists.ListNode k1 = new MergeNodeLists.ListNode(3);
        MergeNodeLists.ListNode k2 = new MergeNodeLists.ListNode(4);

        h1.next = n1;
        n1.next = n2;

        h2.next = k1;
        k1.next = k2;
        MergeNodeLists.ListNode result = mn.mergeNodes(h1,h2);
        MergeNodeLists.ListNode expectedHead = new MergeNodeLists.ListNode(1);
        MergeNodeLists.ListNode e1 = new MergeNodeLists.ListNode(1);
        MergeNodeLists.ListNode e2 = new MergeNodeLists.ListNode(2);
        MergeNodeLists.ListNode e3 = new MergeNodeLists.ListNode(3);
        MergeNodeLists.ListNode e4 = new MergeNodeLists.ListNode(4);
        MergeNodeLists.ListNode e5 = new MergeNodeLists.ListNode(4);
        expectedHead.next = e1;
        e1.next = e2;
        e2.next = e3;
        e3.next = e4;
        e4.next = e5;
        assertEquals(expectedHead, result);
    }
}
