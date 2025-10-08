package leetcode;

import org.example.leetcode.KidsAndCandies;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class KidsAndCandiesTest
{
    private KidsAndCandies kc = new KidsAndCandies();

    @Test
    void testOk(){

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> expected = List.of(true, true, true, false, true);
        List<Boolean> result = kc.kidsWithCandies(candies, extraCandies);

        assertThat(result).isEqualTo(expected);
    }
}
