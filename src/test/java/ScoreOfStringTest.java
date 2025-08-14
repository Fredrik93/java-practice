import org.example.ScoreOfString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ScoreOfStringTest
{
    ScoreOfString s= new ScoreOfString();
    @Test
    void testZaz(){
        int res = s.scoreOfString("zaz");
        assertThat(res).isEqualTo(50);
    }
    @Test
    void testHello(){
        int res = s.scoreOfString("hello");
        assertThat(res).isEqualTo(13);
    }
}
