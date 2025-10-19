package leetcode.medium;

import org.example.leetcode.medium.StrictlyPalindromic;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrictlyPalindromicTest
{
    private StrictlyPalindromic sp = new StrictlyPalindromic();

    @Test
    void testOk(){
        boolean res = sp.isStrictlyPalindromic(9);
        assertThat(res).isFalse();
    }
    @Test
    void testOk1(){
        boolean res = sp.isStrictlyPalindromic(4);
        assertThat(res).isFalse();
    }
}
