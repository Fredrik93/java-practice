package leetcode.easy;

import org.example.leetcode.easy.SmallerNumberThanCurrent;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallerNumberThanCurrentTest {
    private SmallerNumberThanCurrent sntc = new SmallerNumberThanCurrent();

    @Test
    void testOk(){
        int [] res = sntc.smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        assertThat(res).isEqualTo(new int[]{4,0,1,1,3});
    }
    @Test
    void testOk1(){
        int [] res = sntc.smallerNumbersThanCurrent(new int[]{6,5,4,8});
        assertThat(res).isEqualTo(new int[]{2,1,0,3});
    }

    @Test
    void testOk2(){
        int [] res = sntc.smallerNumbersThanCurrent(new int[]{7,7,7,7});
        assertThat(res).isEqualTo(new int[]{0,0,0,0});
    }
}
