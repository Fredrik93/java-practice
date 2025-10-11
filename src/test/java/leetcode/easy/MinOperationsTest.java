package leetcode.easy;

import org.example.leetcode.easy.MinOperations;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinOperationsTest
{
    private MinOperations mo = new MinOperations();

    @Test
    void testOk(){
        int res = mo.minOperations(new int[]{3,9,7}, 5);
        assertThat(res).isEqualTo(4);
    }
    @Test
    void testOk1(){
        int res = mo.minOperations(new int[]{4,1,3}, 4);
        assertThat(res).isEqualTo(0);
    }
    @Test
    void testOk2(){
        int res = mo.minOperations(new int[]{3,2}, 6);
        assertThat(res).isEqualTo(5);
    }

}
