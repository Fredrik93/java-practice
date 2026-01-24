package leetcode.easy;

import org.example.leetcode.easy.BitFlip;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BitFlipTest
{
    private final BitFlip bf = new BitFlip();
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
    @Test
    void test2(){
        int res = bf.minBitFlips(234, 640);
        assertThat(res).isEqualTo(5);
    }
    @Test
    void test3(){
        int res = bf.minBitFlips(9155,3670);
        assertThat(res).isEqualTo(8);
    }
}
