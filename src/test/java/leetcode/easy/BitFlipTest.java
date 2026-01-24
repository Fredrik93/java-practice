package leetcode.easy;

import org.example.leetcode.easy.BitFlip;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BitFlipTest
{
    private BitFlip bf = new BitFlip();
    @Test
    void test(){
        int res = bf.minBitFlips(10,7);
        assertThat(res).isEqualTo(3);
    }
    @Test
    void test1(){
        int res = bf.minBitFlips(3,4);
        assertThat(res).isEqualTo(3);
    }
}
