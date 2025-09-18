package leetcode;

import org.example.leetcode.WealthiestCustomer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WealthiestCustomerTest
{
    private WealthiestCustomer wc = new WealthiestCustomer();
    @Test
    void testOk(){
        int result = wc.maximumWealth(new int[][]{{1,2,3},{3,2,1}});
        assertThat(result).isEqualTo(6);
    }
    @Test
    void testOk1(){
        int result = wc.maximumWealth(new int[][]{{1,5},{7,3}, {3,5}});
        assertThat(result).isEqualTo(10);
    }
    @Test
    void testOk2(){
        int result = wc.maximumWealth(new int[][]{{2,8,7},{7,1,3}, {1,9,5}});
        assertThat(result).isEqualTo(17);
    }
}
