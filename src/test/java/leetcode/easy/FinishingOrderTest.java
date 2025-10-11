package leetcode.easy;

import org.example.leetcode.easy.FinishingOrder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FinishingOrderTest
{
    private final FinishingOrder fo = new FinishingOrder();

    @Test
    void testOk(){
        int [] res = fo.recoverOrder(new int[]{3,1,2,5,4}, new int[] {1,3,4});
        assertThat(res).isEqualTo(new int[]{3,1,4});
    }
    @Test
    void testOk1(){
        int [] res = fo.recoverOrder(new int[]{1,4,5,3,2}, new int[] {2,5});
        assertThat(res).isEqualTo(new int[]{5,2});
    }
}
