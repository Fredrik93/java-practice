package leetcode.easy;

import org.example.leetcode.easy.BitwiseXOR;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BitwiseXORTest {
    private BitwiseXOR bw = new BitwiseXOR();

    /**
     * Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
     * Where "^" corresponds to bitwise XOR operator.
     */
    @Test
    void testOk(){
        int res = bw.xorOperation(5,0);
        assertThat(res).isEqualTo(8);
    }

    /**
     * Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
     */
    @Test
    void testOk1(){
        int res = bw.xorOperation(4,3);
        assertThat(res).isEqualTo(8);
    }
}
