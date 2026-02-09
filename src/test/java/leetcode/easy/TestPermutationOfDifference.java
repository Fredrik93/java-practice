package leetcode.easy;

import org.example.leetcode.easy.PermutationOfDifference;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPermutationOfDifference {
    private PermutationOfDifference pd = new PermutationOfDifference();
    @Test
    void testOk(){
        int res = pd.findPermutationDifference("bla", "bla");
        assertThat(res).isEqualTo(-1);
    }
}
