package leetcode.medium;

import org.example.leetcode.medium.PivotArray;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PivotArrayTest
{
    private PivotArray pa = new PivotArray();

    @Test
    void testOk(){
        int [] res = pa.pivotArray(new int[]{9,12,5,10,14,3,10}, 10);
        int [] expected = new int[]{9,5,3,10,10,12,14};
        assertThat(res).isEqualTo(expected);
    }

    @Test
    void testOk1(){
        int [] res = pa.pivotArray(new int[]{-3,4,3,2}, 2);
        int [] expected = new int[]{-3,2,4,3};
        assertThat(res).isEqualTo(expected);
    }
}
