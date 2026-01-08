package leetcode.easy;

import org.example.leetcode.easy.AlternatingSum;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlternatingSumTest
{
    private AlternatingSum as = new AlternatingSum();

    @Test
    void testOk(){
        int res = as.alternatingSum(new int[]{1,3,5,7});
        assertThat(res).isEqualTo(-4);
    }

    @Test
    void testOk1(){
        int res = as.alternatingSum(new int[]{100});
        assertThat(res).isEqualTo(100);
    }
}
