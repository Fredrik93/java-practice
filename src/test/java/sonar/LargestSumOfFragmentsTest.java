package sonar;

import org.example.sonar.LargestSumOfFragments;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestSumOfFragmentsTest
{
    private LargestSumOfFragments lf = new LargestSumOfFragments();
    @Test
    void testOk(){
        // 43 + 98 = 141 (should be correct you counted by hand and didnt see the expected result)
        int res = lf.sumOfFragments("43798");
        assertThat(res).isEqualTo(141);
    }
    @Test
    void testOk1(){
        // fragments of two cant overlap so the ones i can choose are 00 and 10 == 10
        int res = lf.sumOfFragments("00101");
        assertThat(res).isEqualTo(10);
    }
    @Test
    void testOk2(){
        int res = lf.sumOfFragments("0332331");
        assertThat(res).isEqualTo(66);
    }
    @Test
    void testOk3(){
        // 03 + 31 == 34
        int res = lf.sumOfFragments("00331");
        assertThat(res).isEqualTo(34);
    }
}
