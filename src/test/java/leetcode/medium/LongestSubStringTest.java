package leetcode.medium;

import org.example.leetcode.medium.LongestSubString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestSubStringTest
{
    private LongestSubString ls = new LongestSubString();

    @Test
    void testOk(){
        int res = ls.lengthOfLongestSubstring("abcabcbb");
        assertThat(res).isEqualTo(3);
        assertThat(ls.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);

    }
    @Test
    void testOk1(){
        int res = ls.lengthOfLongestSubstring("bbbbb");
        assertThat(ls.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
    }
    @Test
    void testOk2(){
        int res = ls.lengthOfLongestSubstring("pwwkew");
        assertThat(res).isEqualTo(3);
    }

}
