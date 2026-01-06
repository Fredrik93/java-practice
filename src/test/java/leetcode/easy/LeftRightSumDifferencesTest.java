package leetcode.easy;

import org.example.leetcode.easy.LeftRightSumDifferences;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeftRightSumDifferencesTest
{
    private LeftRightSumDifferences lrd = new LeftRightSumDifferences();

    @Test
    void testOk(){
        int [] res = lrd.sumDifference(new int[]{10,4,8,3});
        assertThat(res).isEqualTo(new int[]{15,1,11,22});
    }
    @Test
    void testOk1(){
        int [] res = lrd.sumDifference(new int[]{1});
        assertThat(res).isEqualTo(new int[]{0});
    }
}
