package leetcode.medium;

import org.example.leetcode.medium.MaxDistinct;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxDistinctTest {
    private MaxDistinct md = new MaxDistinct();

    /**
     * Split "abab" into "a" and "bab".
     * Each substring starts with a distinct character i.e 'a' and 'b'. Thus, the answer is 2.
     */
    @Test
    void testOk(){
        int res = md.maxDistinct("abab");
        assertThat(res).isEqualTo(2);
    }

    @Test
    void testOk1(){
        int res = md.maxDistinct("abcd");
        assertThat(res).isEqualTo(4);
    }

    @Test
    void testOk2(){
        int res = md.maxDistinct("aaaa");
        assertThat(res).isEqualTo(1);
    }
}
