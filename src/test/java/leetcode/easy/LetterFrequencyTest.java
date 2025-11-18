package leetcode.easy;

import org.example.leetcode.easy.LetterFrequency;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LetterFrequencyTest
{
    private LetterFrequency lf = new LetterFrequency();

    @Test
    void testOk(){
        int res = lf.maxFreqSum("successes");
        assertThat(res).isEqualTo(6);
    }
}
