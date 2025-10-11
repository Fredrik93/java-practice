package leetcode.easy;

import org.example.leetcode.easy.PreservedReverse;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PreservedReverseTest
{
    PreservedReverse t1 = new PreservedReverse();
    @Test
    public void test(){
        String r = t1.reverse("He, who must not be named.");

        assertThat(r).isEqualTo("eH, ohw tsum ton eb deman.");
    }
    @Test
    public void testSingleWord() {
        String r = t1.reverse("Hello");
        assertThat(r).isEqualTo("olleH");
    }

    @Test
    public void testMultipleSpaces() {
        String r = t1.reverse("Hello   world");
        assertThat(r).isEqualTo("olleH   dlrow");
    }
    @Test
    public void testMultipleSpaces2() {
        String r = t1.reverse("He   wo");
        assertThat(r).isEqualTo("eH   ow");
    }

    @Test
    public void testPunctuationInsideSentence() {
        String r = t1.reverse("Hi, there!");
        assertThat(r).isEqualTo("iH, ereht!");
    }

    @Test
    public void testNumbersAndSymbols() {
        String r = t1.reverse("123, go!");
        assertThat(r).isEqualTo("321, og!");
    }

    @Test
    public void testEmptyString() {
        String r = t1.reverse("");
        assertThat(r).isEqualTo("");
    }

    @Test
    public void testOnlySpaces() {
        String r = t1.reverse("     ");
        assertThat(r).isEqualTo("     ");
    }

    @Test
    public void testMixedCase() {
        String r = t1.reverse("Java Rocks!");
        assertThat(r).isEqualTo("avaJ skcoR!");
    }

    @Test
    public void testComplexSentence() {
        String r = t1.reverse("Wait... what? Really?");
        assertThat(r).isEqualTo("tiaW... tahw? yllaeR?");
    }
}
