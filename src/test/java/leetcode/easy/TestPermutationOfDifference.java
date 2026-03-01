package leetcode.easy;

import org.example.leetcode.easy.PermutationOfDifference;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPermutationOfDifference {
    private PermutationOfDifference pd = new PermutationOfDifference();
    @Test
    void testOk(){
        int res = pd.findPermutationDifference("abc", "bac");
        assertThat(res).isEqualTo(2);
    }

    @Test
    void testOk1(){
        int res = pd.findPermutationDifference("abcde", "edbac");
        assertThat(res).isEqualTo(12);
    }
}
