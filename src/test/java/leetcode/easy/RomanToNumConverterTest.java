package leetcode.easy;

import org.example.leetcode.easy.RomanToNumConverter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanToNumConverterTest {
    private final RomanToNumConverter rtn = new RomanToNumConverter();

    @Test
    void testOk(){
        int res = rtn.romanToInt("III");
        assertThat(res).isEqualTo(3);
    }

    @Test
    void testOk1(){
        int res = rtn.romanToInt("LVIII");
        assertThat(res).isEqualTo(58);
    }

    @Test
    void testOk2(){
        int res = rtn.romanToInt("MCMXCIV");
        assertThat(res).isEqualTo(1994);
    }
    @Test
    void testOk3(){
        int res = rtn.romanToInt("VIII");
        assertThat(res).isEqualTo(8);
    }
    @Test
    void testOk4(){
        int res = rtn.romanToInt("XIV");
        assertThat(res).isEqualTo(14);
    }
}
