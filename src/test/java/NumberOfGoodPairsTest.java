import org.example.NumberOfGoodPairs;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfGoodPairsTest
{
    private NumberOfGoodPairs ng = new NumberOfGoodPairs();
    @Test
    void testOk(){
        int result = ng.numIdenticalPairs(new int[]{1,2,3,1,1,3});
        assertThat(result).isEqualTo(4);
    }
    @Test
    void testOk1(){
        int result = ng.numIdenticalPairs(new int[]{1,1,1,1});
        assertThat(result).isEqualTo(6);
    }
    @Test
    void testOk2(){
        int result = ng.numIdenticalPairs(new int[]{1,2,3});
        assertThat(result).isEqualTo(0);
    }
}
