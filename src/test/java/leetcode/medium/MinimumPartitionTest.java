package leetcode.medium;

import org.example.leetcode.medium.MinimumPartition;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumPartitionTest {
    private MinimumPartition mp = new MinimumPartition();

    @Test
    void testOk(){
        int res = mp.minPartitions("32");
        assertThat(res).isEqualTo(3);
    }

    @Test
    void testOk1(){
        int res = mp.minPartitions("82734");
        assertThat(res).isEqualTo(8);
    }

    @Test
    void testOk2(){
        int res = mp.minPartitions("27346209830709182346");
        assertThat(res).isEqualTo(9);
    }

    @Test
    void testOk3(){
        int res = mp.minPartitions("333");
        assertThat(res).isEqualTo(3);
    }
    @Test
    void testOk4(){
        int res = mp.minPartitions("6");
        assertThat(res).isEqualTo(6);
    }
    @Test
    void testOk5(){
        int res = mp.minPartitions("23");
        assertThat(res).isEqualTo(2);
    }
}
