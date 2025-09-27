package visa;

import org.example.visa.UnknownNumber;
import org.example.visa.UnknownNumbersAttempt2;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnkownNumberTest
{
    private UnknownNumbersAttempt2 un = new UnknownNumbersAttempt2();

    @Test
    void testOk()
    {
        String[][] input = { { "7", "3", "12", "1" }, { "14", "?", "6", "9" }, { "2", "15", "4", "11" },
                { "13", "8", "16", "5" } };
        String[][] expected = {
                { "1",  "2",  "3",  "4" },
                { "5",  "6",  "7",  "8" },
                { "9",  "10", "11", "12" },
                { "13", "14", "15", "16" }
        };
        String[][] result = un.findUnknownNumber(input);
        assertThat(result).isEqualTo(expected);

    }
    @Test
    void testQuestionAtStart() {
        String[][] input = {
                { "?", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };
        String[][] expected = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };
        String[][] result = un.findUnknownNumber(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testQuestionAtEnd() {
        String[][] input = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "?" }
        };
        String[][] expected = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };
        String[][] result = un.findUnknownNumber(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testQuestionInMiddle() {
        String[][] input = {
                { "1", "2", "3", "4" },
                { "5", "6", "?", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };
        String[][] expected = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };
        String[][] result = un.findUnknownNumber(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testQuestionRandomSpot() {
        String[][] input = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "9", "10", "11", "?" },
                { "13", "14", "15", "16" }
        };
        String[][] expected = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };
        String[][] result = un.findUnknownNumber(input);
        assertThat(result).isEqualTo(expected);
    }

}
