package amazon;

import org.example.amazon.ReverseArrayQueries;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseArrayQueriesTest
{

    @Test
    void testOk()
    {
        List<Integer> res = ReverseArrayQueries.performOperations(Arrays.asList(1, 2, 3),
                Arrays.asList(Arrays.asList(0, 2), Arrays.asList(1, 2), Arrays.asList(0, 2)));
        assertThat(res).isEqualTo(Arrays.asList(2, 1, 3));
    }
}
