package leetcode.medium;

import org.example.leetcode.medium.ZigzagConversion;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZigzagConversionTest
{
    private ZigzagConversion zc = new ZigzagConversion();

    @Test
    void testOk()
    {
        String result = zc.convert("PAYPALISHIRING", 3);
        assertThat(result).isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void testOk1()
    {
        String result = zc.convert("PAYPALISHIRING", 4);
        assertThat(result).isEqualTo("PINALSIGYAHRPI");
    }

    @Test
    void testOk2()
    {
        String result = zc.convert("A", 1);
        assertThat(result).isEqualTo("A");
    }

    @Test
    void testOk3()
    {
        String result = zc.convert("AB", 1);
        assertThat(result).isEqualTo("AB");
    }

    @Test
    void testOk4()
    {
        String result = zc.convert("ABCDE", 1);
        assertThat(result).isEqualTo("ABCDE");
    }

    @Test
    void testOk5()
    {
        String result = zc.convert("PAYPALISHIRING", 1);
        assertThat(result).isEqualTo("PAYPALISHIRING");
    }

    @Test
    void testOk6()
    {
        String result = zc.convert("PAYPALISHIRING", 2);
        assertThat(result).isEqualTo("PYAIHRNAPLSIIG");
    }

    @Test
    void testOk7()
    {
        String result = zc.convert("ABC", 2);
        assertThat(result).isEqualTo("ACB");
    }

    @Test
    void testOk8()
    {
        String result = zc.convert("PAYPALISHIRING", 5);
        assertThat(result).isEqualTo("PHASIYIRPLIGAN");
    }

    @Test
    void testOk9()
    {
        String result = zc.convert("PAYPALISHIRING", 6);
        assertThat(result).isEqualTo("PRAIIYHNPSGAIL");
    }

    @Test
    void testOk10()
    {
        String result = zc.convert("PAYPALISHIRING", 7);
            assertThat(result).isEqualTo("PNAIGYRPIAHLSI");
    }
}


