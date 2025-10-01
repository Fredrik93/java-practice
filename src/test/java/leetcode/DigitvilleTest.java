package leetcode;

import org.example.leetcode.Digitville;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DigitvilleTest
{
    private Digitville dv = new Digitville();

    @Test
    void testOk0()
    {
        int[] res = dv.getSneakyNumbers(new int[] { 0, 1, 1, 0 });
        assertThat(res).isEqualTo(new int[] { 0, 1 });
    }
    @Test
    void testOk03()
    {
        int[] res = dv.getSneakyNumbers(new int[] { 1,2,2,1 });
        assertThat(res).isEqualTo(new int[] { 1,2 });
    }

    @Test
    void testOk1()
    {
        int[] res = dv.getSneakyNumbers(new int[] { 0, 3, 2, 1, 3, 2 });
        assertThat(res).isEqualTo(new int[] { 2, 3 });
    }

    @Test
    void testOk2()
    {

        int[] res = dv.getSneakyNumbers(new int[] { 7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2 });
        assertThat(res).isEqualTo(new int[] { 4, 5 });
    }
}
