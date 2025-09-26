package visa;

import org.example.visa.UnknownNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnkownNumberTest
{
    private UnknownNumber un = new UnknownNumber();

    @Test
    void testOk()
    {
        String[][] input = { { "7", "3", "12", "1" }, { "14", "?", "6", "9" }, { "2", "15", "4", "11" },
                { "13", "8", "16", "5" } };
        String[][] expected = { { "7", "3", "12", "1" }, { "14", "10", "6", "9" }, { "2", "15", "4", "11" },
                { "13", "8", "16", "5" } };
        String[][] result = un.findUnknownNumber(input);
        assertThat(result).isEqualTo(expected);

    }
}
