package leetcode.medium;

import org.example.leetcode.medium.DeciNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeciNumbersTest {

        private DeciNumbers dn = new DeciNumbers();

        @Test
    void testOk(){
            int res = dn.minPartitions("32");
            assertEquals(3, res);
    }
    @Test
    void testOk1(){
        int res = dn.minPartitions("82734");
        assertEquals(8, res);
    }
    @Test
    void testOk2(){
        int res = dn.minPartitions("27346209830709182346");
        assertEquals(9, res);
    }

}
