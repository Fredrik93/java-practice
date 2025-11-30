package leetcode.medium;

import org.example.leetcode.medium.MyAtoi;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyAtoiTest
{
    private MyAtoi ma = new MyAtoi();
    @Test
    void testOk(){
        int result = ma.myAtoi("42");
        assertThat(result).isEqualTo(42);
    }
    @Test
    void testOk1(){
        int result = ma.myAtoi("-042");
        assertThat(result).isEqualTo(-42);
    }
    @Test
    void testOk3(){
        int result = ma.myAtoi("1337c0d3");
        assertThat(result).isEqualTo(1337);
    }
    @Test
    void testOk4(){
        int result = ma.myAtoi("0-1");
        assertThat(result).isEqualTo(0);
    }
    @Test
    void testOk5(){
        int result = ma.myAtoi("words and 987");
        assertThat(result).isEqualTo(987);
    }
    @Test
    void testOk6(){
        int result = ma.myAtoi("000987");
        assertThat(result).isEqualTo(987);
    }
}
