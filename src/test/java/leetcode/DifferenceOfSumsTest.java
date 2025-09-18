package leetcode;

import org.example.leetcode.DifferenceOfSums;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DifferenceOfSumsTest
{
    DifferenceOfSums ds = new DifferenceOfSums();
    @Test
    void test10nDivisibleBy3(){
        int result = ds.differenceOfSums(10, 3);
        assertThat(result).isEqualTo(19);
    }
    @Test
    void test5nDivisibleBy6(){
        int result = ds.differenceOfSums(5,6);
        assertThat(result).isEqualTo(15);
    }
}
