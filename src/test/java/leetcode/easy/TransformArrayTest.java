package leetcode.easy;

import org.example.leetcode.easy.TransformArray;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformArrayTest
{
    private TransformArray ta = new TransformArray();

    @Test
    void testOk(){
        int [] result = ta.transformArray(new int[]{4,3,2,1});
        assertThat(result).isEqualTo(new int[]{0,0,1,1});
    }
    @Test
    void testOk1(){
        int [] result = ta.transformArray(new int[]{1,5,1,4,2});
        assertThat(result).isEqualTo(new int[]{0,0,1,1,1});
    }
}
