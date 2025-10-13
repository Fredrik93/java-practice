package leetcode.medium;

import org.example.leetcode.medium.GreatestCommonDivisor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreatestCommonDivisorTest {

    private GreatestCommonDivisor gd = new GreatestCommonDivisor();

    @Test
    void testOk() {
        // Input list: 18 -> 6 -> 10 -> 3
        GreatestCommonDivisor.ListNode node = gd.new ListNode(18);
        node.next = gd.new ListNode(6);
        node.next.next = gd.new ListNode(10);
        node.next.next.next = gd.new ListNode(3);

        GreatestCommonDivisor.ListNode res = gd.insertGreatestCommonDivisors(node);

        // Expected list: 18 -> 6 -> 6 -> 2 -> 10 -> 1 -> 3
        GreatestCommonDivisor.ListNode expected = gd.new ListNode(18);
        expected.next = gd.new ListNode(6);
        expected.next.next = gd.new ListNode(6);
        expected.next.next.next = gd.new ListNode(2);
        expected.next.next.next.next = gd.new ListNode(10);
        expected.next.next.next.next.next = gd.new ListNode(1);
        expected.next.next.next.next.next.next = gd.new ListNode(3);

        // Compare full list
        assertThat(listToString(res)).isEqualTo(listToString(expected));
    }

    private String listToString(GreatestCommonDivisor.ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val).append("->");
            node = node.next;
        }
        return sb.toString();
    }
}
