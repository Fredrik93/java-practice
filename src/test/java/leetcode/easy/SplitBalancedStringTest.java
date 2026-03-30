package leetcode.easy;

import org.example.leetcode.easy.SplitBalancedString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitBalancedStringTest {
    private SplitBalancedString splitBalancedString = new SplitBalancedString();

    @Test
    void testOk() {
        int res = splitBalancedString.balancedStringSplit("RLRRLLRLRL");
        assertThat(res).isEqualTo(4);
    }

    @Test
    void testOk1() {
        int res = splitBalancedString.balancedStringSplit("RLRRRLLRLL");
        assertThat(res).isEqualTo(2);
    }

    @Test
    void testOk2() {
        int res = splitBalancedString.balancedStringSplit("LLLLRRRR");
        assertThat(res).isEqualTo(1);
    }

    @Test
    void testOk3() {
        int res = splitBalancedString.balancedStringSplit("RLRLRL");
        assertThat(res).isEqualTo(3);
    }
}
