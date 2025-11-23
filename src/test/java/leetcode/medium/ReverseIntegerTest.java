package leetcode.medium;

import org.example.leetcode.medium.ReverseInteger;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseIntegerTest
{
    private ReverseInteger ri = new ReverseInteger();

    @Test
    void testOk1()
    {
        int res = ri.reverse(123);
        assertThat(res).isEqualTo(321);
    }

    @Test
    void testOk2()
    {
        int res = ri.reverse(-123);
        assertThat(res).isEqualTo(-321);
    }

    @Test
    void testOk3()
    {
        int res = ri.reverse(120);
        assertThat(res).isEqualTo(21);
    }
}
