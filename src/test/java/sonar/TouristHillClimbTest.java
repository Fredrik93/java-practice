package sonar;

import org.example.sonar.TouristHillClimb;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TouristHillClimbTest
{
    private TouristHillClimb tc = new TouristHillClimb();

    @Test
    void testOk()
    {
        // the tourist going to the left cant move so 0. And tourist going right moves to index 2 which is three steps.
        int res = tc.findSteps(new int[] { 1, 5, 7, 4 });
        assertThat(res).isEqualTo(3);
    }

    @Test
    void testOk1()
    {
        // tourist going left can move two blocks and tourist gonig right can move one block
        int res = tc.findSteps(new int[] { 2,6,6,3,7 });
        assertThat(res).isEqualTo(4);
    }

    @Test
    void testOk2()
    {
        // one of the tourists can move one block so 2 steps
        int res = tc.findSteps(new int[] { 2,2 });
        assertThat(res).isEqualTo(2);
    }
}
