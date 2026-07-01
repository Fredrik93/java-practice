package exercises;

import org.example.exercises.SumOfNumbers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfNumbersTest {
    @Test
    void testSumOfNumbersOk(){
        SumOfNumbers sn = new SumOfNumbers();
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        int res = sn.sum(list);
        assertThat(res).isEqualTo(20);
    }
    @Test
    void testGroupNamesByLength(){
        SumOfNumbers sn = new SumOfNumbers();
        List<String> names = List.of("Anna", "Bob", "Fred", "Liz", "Patrik");
        Map<Integer, List<String>> res = sn.groupNamesByLength(names);

        // expected result
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(6, List.of("Patrik"));
        expected.put(4, List.of("Anna", "Fred"));
        expected.put(3, List.of("Bob", "Liz"));


        // assertion
        assertThat(res).isEqualTo(expected);
    }
    @Test
    void testAverageAge(){
        SumOfNumbers sn = new SumOfNumbers();
        SumOfNumbers.Person p1 = new SumOfNumbers.Person("Fred", 45);
        SumOfNumbers.Person p2 = new SumOfNumbers.Person("Liz", 25);
        SumOfNumbers.Person p3 = new SumOfNumbers.Person("Anne", 50);
        List<SumOfNumbers.Person> people = new ArrayList<>(List.of(p1, p2, p3));
        double res = sn.averageAge(people);
        assertThat(res).isEqualTo(40.00);
    }
    @Test
    void testSortNames(){
        SumOfNumbers sn = new SumOfNumbers();
        List<String> res = sn.sortNames(List.of("Fred", "Anne", "Liz", "beth"));
        assertThat(res).isEqualTo(List.of("Anne", "Fred", "Liz"));
    }
    @Test
    void createPerson (){
        SumOfNumbers.Person p = new SumOfNumbers.Person("Linn", 35);

    }
}
