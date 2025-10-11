package leetcode.easy;

import org.example.leetcode.easy.AllowedStrings;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AllowedStringsTest
{
    private AllowedStrings as = new AllowedStrings();

    @Test
    void testOk(){
        int res = as.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"});
        assertThat(res).isEqualTo(2);
    }
    @Test
    void testOk1(){
        int res = as.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"});
        assertThat(res).isEqualTo(7);
    }
    @Test
    void testOk2(){
        int res = as.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"});
        assertThat(res).isEqualTo(4);
    }
}
