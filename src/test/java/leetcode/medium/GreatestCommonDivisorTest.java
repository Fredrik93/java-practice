package leetcode.medium;

import org.example.leetcode.medium.GreatestCommonDivisor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreatestCommonDivisorTest
{
    private GreatestCommonDivisor gd = new GreatestCommonDivisor();
    @Test
    void testOk(){
        GreatestCommonDivisor.ListNode node = gd.new ListNode(5);

        GreatestCommonDivisor.ListNode res = gd.insertGreatestCommonDivisors(node);
        assertThat(res.val).isEqualTo(2);
    }
}
