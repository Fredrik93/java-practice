import org.example.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest
{
    ValidParentheses vp = new ValidParentheses();
    @Test
    void testOk(){
        boolean result = vp.isValid("()");
        assertTrue(result);
    }
    @Test
    void testOk1(){
        boolean result = vp.isValid("([{}])");
        assertTrue(result);
    }
    @Test
    void testOk2(){
        boolean result = vp.isValid("({}[])");
        assertTrue(result);
    }
}
