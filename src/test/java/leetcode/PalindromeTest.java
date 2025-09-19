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
        assertThat(result).isEqualTo(true);
    }
    @Test
    void testOk3(){
        boolean result = p.isPalindrome(1001);
        assertThat(result).isEqualTo(true);
    }
}
