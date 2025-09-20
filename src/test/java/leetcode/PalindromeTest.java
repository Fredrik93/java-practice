package leetcode;

import org.example.leetcode.Palindrome;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest
{
    private Palindrome p = new Palindrome();

    @Test
    void testOk(){
        boolean result = p.isPalindrome(121);
        assertThat(result).isEqualTo(true);
    }

    @Test
    void testOk1(){
        boolean result = p.isPalindrome(-121);
        assertThat(result).isEqualTo(false);
    }
    @Test
    void testOk2(){
        boolean result = p.isPalindrome(10);
        assertThat(result).isEqualTo(false);
    }
    @Test
    void testOk3(){
        boolean result = p.isPalindrome(1001);
        assertThat(result).isEqualTo(true);
    }
    @Test
    void testOk4(){
        boolean result = p.isPalindrome(123);
        assertThat(result).isEqualTo(false);
    }
    @Test
    void testOk5(){
        boolean result = p.isPalindrome(1221);
        assertThat(result).isEqualTo(true);
    }
    @Test
    void testOk6(){
        boolean result = p.isPalindrome(1234554321);
        assertThat(result).isEqualTo(true);
    }
    // this test passes but its incorrect. it results to 0 and compares 12345 == 0 which is false indeed, but it should compute 12345 == 54321.
    @Test
    void testOk7(){
        boolean result = p.isPalindrome(12345);
        assertThat(result).isEqualTo(false);
    }
}
