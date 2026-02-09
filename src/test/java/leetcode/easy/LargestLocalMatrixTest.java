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
    @Test
    void testOk1(){
        int [][] res = llm.largestLocal(new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}});
        assertThat(res).isEqualTo(new int[][]{{2,2,2},{2,2,2},{2,2,2}});
    }

    @Test
    void testOk2(){
        int [][] res = llm.largestLocal(new int[][]{{2,5,5},{3,2,5},{1,2,3}});
        assertThat(res).isEqualTo(new int[][]{{-2,-2,-2}});
    }
    @Test
    void testOk3(){

        int [][] res = llm.largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}});
        assertThat(res).isEqualTo(new int[][]{{9,9},{8,6}});

    }

}
