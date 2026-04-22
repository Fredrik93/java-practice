package leetcode.easy;

import org.example.leetcode.easy.WideVerticalArea;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WideVerticalAreaTest {
    private WideVerticalArea wa = new WideVerticalArea();

    @Test
    void testOk(){
        int [][] input = new int[][]{{8,7},{9,9},{7,4},{9,7}};
        int result = wa.maxWidthOfVerticalArea(input);
        assertThat(result).isEqualTo(1);
    }
    @Test
    void testOk2(){
        int [][] input = new int[][]{{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        int result = wa.maxWidthOfVerticalArea(input);
        assertThat(result).isEqualTo(3);
    }
}
