package leetcode;

import org.example.leetcode.RomanNumerals;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RomanNumeralsTest
{
    private RomanNumerals rn = new RomanNumerals();

    @Test
    void testOk()
    {
        int result = rn.romanToInt("III");
        assertThat(result).isEqualTo(3);
    }
    @Test
    void testOk1()
    {
        int result = rn.romanToInt("IV");
        assertThat(result).isEqualTo(4);
    }
    @Test
    void testOk2()
    {
        int result = rn.romanToInt("V");
        assertThat(result).isEqualTo(5);
    }
    @Test
    void testOk3()
    {
        int result = rn.romanToInt("VI");
        assertThat(result).isEqualTo(6);
    }
    @Test
    void testOk4()
    {
        int result = rn.romanToInt("IX");
        assertThat(result).isEqualTo(9);
    }

    @Test
    void testOk5()
    {
        int result = rn.romanToInt("X");
        assertThat(result).isEqualTo(10);
    }

    @Test
    void testOk6()
    {
        int result = rn.romanToInt("XL");
        assertThat(result).isEqualTo(40);
    }

    @Test
    void testOk7()
    {
        int result = rn.romanToInt("L");
        assertThat(result).isEqualTo(50);
    }

    @Test
    void testOk8()
    {
        int result = rn.romanToInt("XC");
        assertThat(result).isEqualTo(90);
    }

    @Test
    void testOk9()
    {
        int result = rn.romanToInt("C");
        assertThat(result).isEqualTo(100);
    }

    @Test
    void testOk10()
    {
        int result = rn.romanToInt("CD");
        assertThat(result).isEqualTo(400);
    }

    @Test
    void testOk11()
    {
        int result = rn.romanToInt("D");
        assertThat(result).isEqualTo(500);
    }

    @Test
    void testOk12()
    {
        int result = rn.romanToInt("CM");
        assertThat(result).isEqualTo(900);
    }

    @Test
    void testOk13()
    {
        int result = rn.romanToInt("M");
        assertThat(result).isEqualTo(1000);
    }

    @Test
    void testOk14()
    {
        int result = rn.romanToInt("MCMXCIV"); // 1000 + 900 + 90 + 4
        assertThat(result).isEqualTo(1994);
    }

    @Test
    void testOk15()
    {
        int result = rn.romanToInt("MMMCMXCIX"); // 3000 + 900 + 90 + 9
        assertThat(result).isEqualTo(3999);
    }





}
