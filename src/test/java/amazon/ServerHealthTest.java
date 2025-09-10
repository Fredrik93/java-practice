package amazon;

import org.example.amazon.ServerHealth;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ServerHealthTest
{
    @Test
    void testOk(){
        int res = ServerHealth.getMaximumHealth(Arrays.asList(35,35,35,35));
        assertThat(res).isEqualTo(38);
    }
    @Test
    void testOk1(){
        int res = ServerHealth.getMaximumHealth(Arrays.asList(2,1,2,3));
        // 2,1,2,3 -> 2,2,3,4 -> 3,2,4,5 -> 4,3,4,6 -> 5,4,5,6
        assertThat(res).isEqualTo(6);
    }
}
