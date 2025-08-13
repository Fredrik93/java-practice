import org.example.ValidParentheses2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest
{
    ValidParentheses2 vp = new ValidParentheses2();
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
     @Test
    void testOk3(){
        boolean result = vp.isValid("]");
        assertFalse(result);
    }
}
