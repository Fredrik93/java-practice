package leetcode.easy;

import org.example.leetcode.easy.LargestLocalMatrix;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestLocalMatrixTest
{
    private LargestLocalMatrix llm = new LargestLocalMatrix();

    @Test
    void testOk(){
        int [][] res = llm.largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}});
        assertThat(res).isEqualTo(new int[][]{{9,9}, {8,6}});
    }
}
