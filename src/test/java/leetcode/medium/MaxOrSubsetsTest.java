package leetcode.medium;

import org.example.leetcode.medium.MaxOrSubsets;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxOrSubsetsTest
{
    private MaxOrSubsets ms = new MaxOrSubsets();

    @Test
    void testOk(){
        int res = ms.countMaxOrSubsets(new int[]{3,1});
        assertThat(res).isEqualTo(2);
    }
    @Test
    void testOk1(){
        int res = ms.countMaxOrSubsets(new int[]{2,2,2});
        assertThat(res).isEqualTo(7);
    }
    @Test
    void testOk2(){
        int res = ms.countMaxOrSubsets(new int[]{3,2,1,5});
        assertThat(res).isEqualTo(6);
    }
}
