package leetcode.easy;

import org.example.leetcode.easy.MirrorDistance;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MirrorDistanceTest {
    private MirrorDistance md = new MirrorDistance();

    @Test
    void testOk(){
        int res = md.mirrorDistance(25);
        assertThat(res).isEqualTo(27);
    }

    @Test
    void testOk1(){
        int res = md.mirrorDistance(10);
        assertThat(res).isEqualTo(9);
    }
    @Test
    void testOk2(){
        int res = md.mirrorDistance(7);
        assertThat(res).isEqualTo(0);
    }
}
