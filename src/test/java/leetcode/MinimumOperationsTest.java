package leetcode;

import org.example.leetcode.MinimumOperations;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumOperationsTest
{
    private MinimumOperations mo = new MinimumOperations();

    /**
     * All are divisble by three
     */
    @Test
    void testOk(){
        int res = mo.minimumOperations(new int [] {3,6,9});
        assertThat(res).isEqualTo(0);
    }

    /**
     * All array elements can be made divisible by 3 using 3 operations:
     *
     * Subtract 1 from 1.
     * Add 1 to 2.
     * Subtract 1 from 4.
     */
    @Test
    void testOk1(){
        int res = mo.minimumOperations(new int [] {1,2,3,4});
        assertThat(res).isEqualTo(3);
    }
}
