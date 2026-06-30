package org.example.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class SumOfNumbers {
    public int sum(List<Integer> list){

        return list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
    }

    public Map<Integer, List<String>> groupNamesByLength(List<String> listOfNames){
        return listOfNames.stream().collect(Collectors.groupingBy(String::length));
    }

    public double averageAge(List<Person> people){
        double avg = people.stream().mapToDouble(Person::age).average().orElse(0.00);
        return Math.round(avg * 100.0) / 100.0;
    }
public record Person(String name, int age) {}

    public List<String> sortNames(List<String> names){
        return List.of("none");
    }
}


