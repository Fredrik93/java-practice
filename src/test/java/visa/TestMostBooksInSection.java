package visa;

import org.example.visa.MostBooksInSection;
import org.example.visa.MostBooksInSectionAttempt2;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestMostBooksInSection
{
    private MostBooksInSectionAttempt2 ms = new MostBooksInSectionAttempt2();

    @Test
    void testOk(){
        List<String> input = List.of("visit sectionA", "add bookA", "add bookB", "add bookA", "visit sectionB", "visit sectionC", "add bookA", "add bookB", "add bookC");
       String [] list = new String[]{"visit sectionA", "add bookA", "add bookB", "add bookA", "visit sectionB", "visit sectionC", "add bookA", "add bookB", "add bookC"};
        String result = ms.sectionWithMostBooks(list);
        assertThat(result).isEqualTo("sectionC");
    }
    @Test
    void testOk1(){
        List<String> input = List.of(
                "visit sectionA", "add bookA", "add bookB", "add bookC",
                "add bookD",
                "visit sectionB",
                "add bookA",
                "visit sectionC", "add bookA", "add bookB", "add bookC");
        String [] list = new String[]{"visit sectionA", "add bookA", "add bookB", "add bookC", "add bookD", "visit sectionB", "add bookA", "visit sectionC", "add bookA", "add bookB", "add bookC"};
        String result = ms.sectionWithMostBooks(list);
        assertThat(result).isEqualTo("sectionA");
    }
}
