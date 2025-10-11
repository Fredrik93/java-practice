package leetcode.easy;

import org.example.leetcode.easy.NumOfLettersInString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumOfLettersInStringTest
{
    private NumOfLettersInString ns = new NumOfLettersInString();

    @Test
    void testNumOk(){
        int result = ns.numJewelsInStones("aA","aaABBccd");
        assertThat(result).isEqualTo(3);
    }
}
