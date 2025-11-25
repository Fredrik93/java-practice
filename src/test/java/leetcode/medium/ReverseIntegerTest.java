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
    @Test
    void testOk4()
    {
        int res = ri.reverse(900000);
        assertThat(res).isEqualTo(9);
    }
    @Test
    void testOk5()
    {
        int res = ri.reverse(1534236469);
        assertThat(res).isEqualTo(0);
    }

    @Test
    void testOk6()
    {
        int res = ri.reverse(8192);
        assertThat(res).isEqualTo(2918);
    }


}
