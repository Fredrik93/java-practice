package visa;

import org.example.visa.SumNumbers;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSumNumbers
{
    private SumNumbers sn = new SumNumbers();

    @Test
    void testOk(){
        int result = sn.sumOfNumbers(54321);
        assertThat(result).isEqualTo(3);
    }
    @Test
    void testOk1(){
        int result = sn.sumOfNumbers(222);
        assertThat(result).isEqualTo(2);
    }
}
