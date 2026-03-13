package leetcode.easy;

import org.example.leetcode.easy.ListNode;
import org.example.leetcode.easy.MergeSortedLists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortedListsTest {
    private MergeSortedLists msl = new MergeSortedLists();

    @Test
    void testOk(){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode res = msl.mergeTwoLists(l1,l2);

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));


        assertThat(res).isEqualTo(expected);
    }


}
