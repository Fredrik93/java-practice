package leetcode.easy;

import org.example.leetcode.easy.DateToBinary;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DateToBinaryTest
{
    private DateToBinary db = new DateToBinary();

    @Test
    void testOk(){
        String result = db.convertDateToBinary("2080-02-29");
        assertThat(result).isEqualTo("100000100000-10-11101");
    }

    @Test
    void testOk1(){
        String result = db.convertDateToBinary("1900-01-01");
        assertThat(result).isEqualTo("11101101100-1-1");
    }

}
