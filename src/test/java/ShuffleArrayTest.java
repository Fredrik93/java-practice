import org.example.ShuffleArray;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShuffleArrayTest
{
    private ShuffleArray sa = new ShuffleArray();

    @Test
    void testOk(){
        int [] res = sa.shuffle(new int[]{2,5,1,3,4,7}, 3);
        assertThat(res).isEqualTo(new int[]{2,3,5,4,1,7});
    }
    @Test
    void testOk1(){
        int [] res = sa.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4);
        assertThat(res).isEqualTo(new int[]{1,4,2,3,3,2,4,1});
    }
    @Test
    void testOk2(){
        int [] res = sa.shuffle(new int[]{1,1,2,2}, 2);
        assertThat(res).isEqualTo(new int[]{1,2,1,2});
    }
}
