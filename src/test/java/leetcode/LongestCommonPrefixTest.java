package leetcode;

import org.example.leetcode.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LongestCommonPrefixTest
{

    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void testOk1(){
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {"flower","flow","flight"});
        assertThat(result).isEqualTo("fl");
    }
    @Test
    void testOk(){
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {"flower","fow","fight"});
        assertThat(result).isEqualTo("f");
    }
    @Test
    void testNoCommonPrefix() {
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {"dog", "racecar", "car"});
        assertThat(result).isEqualTo("");
    }
    @Test
    void testAllSameStrings() {
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {"test", "test", "test"});
        assertThat(result).isEqualTo("test");
    }

    @Test
    void testSingleString() {
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {"alone"});
        assertThat(result).isEqualTo("alone");
    }
    @Test
    void testEmptyArray() {
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {});
        assertThat(result).isEqualTo("");
    }
    @Test
    void testEmptyStrings() {
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {"","", ""});
        assertThat(result).isEqualTo("");
    }
    @Test
    void testOk2() {
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {"cir","car"});
        assertThat(result).isEqualTo("c");
    }

}
