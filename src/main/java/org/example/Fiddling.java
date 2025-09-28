package org.example;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Fiddling
{
    private List<String> cars = List.of("Volva", "Marcedes", "BAW", "Opal");
    private int number = 54321;

    public static void main(String[] args)
    {
        Fiddling f = new Fiddling();
    }

    private List<String> carToLowerCase()
    {
        return cars.stream().map(String::toLowerCase).toList();
    }

    private List<String> replaceAllAs()
    {
        return cars.stream().map(c -> c.replace("A", "O")).map(c -> c.replace("a", "o")).toList();

    }

}
