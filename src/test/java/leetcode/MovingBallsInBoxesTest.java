package leetcode;

import org.example.leetcode.MovingBallsInBoxes;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovingBallsInBoxesTest
{
    private MovingBallsInBoxes mb = new MovingBallsInBoxes();

    @Test
    void testOk(){
        int [] res = mb.minOperations("110");
        assertThat(res).isEqualTo(new int[]{1,1,3});
    }

    @Test
    void testOk1(){
        int [] res = mb.minOperations("001011");
        assertThat(res).isEqualTo(new int[]{11,8,5,4,3,4});
    }
}
