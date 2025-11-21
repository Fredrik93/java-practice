package leetcode.medium;

import org.example.leetcode.medium.ZigzagConversion;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZigzagConversionTest
{
    private ZigzagConversion zc = new ZigzagConversion();
    @Test
    void testOk(){
        String result = zc.convert("PAYPALISHIRING", 3);
        assertThat(result).isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void testOk1(){
        String result = zc.convert("PAYPALISHIRING", 4);
        assertThat(result).isEqualTo("PINALSIGYAHRPI");
    }

    @Test
    void testOk2(){
        String result = zc.convert("A", 1);
        assertThat(result).isEqualTo("A");
    }
    @Test
    void testOk3(){
        String result = zc.convert("AB", 1);
        assertThat(result).isEqualTo("AB");
    }
}
