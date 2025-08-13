import org.example.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RemoveDuplicatesTest
{
    RemoveDuplicates rd = new RemoveDuplicates();
    @Test
    void testOk(){
        int res = rd.removeDuplicates(new int[]{1,2,2});
        assertThat(res).isEqualTo(2);
    }
}
