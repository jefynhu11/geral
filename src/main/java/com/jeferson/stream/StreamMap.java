package com.jeferson.stream;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Man");
        names.add("Don");
        names.add("Woman");

        System.out.println("------------------------------");
        // 39 linhas igual
        List<String> names1 = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
        names1.stream().filter(s -> s.startsWith("A"))
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(s -> System.out.println(s));

        System.out.println("B------------------------------");

        Stream<String> newStream = Stream.concat(names.stream(), names1.stream()).distinct();
//        newStream.sorted().forEach(s-> System.out.println(s));
        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
        System.out.println(flag);
        Assertions.assertTrue(flag);

        System.out.println("------------------------------");

        //Imprimir nomes têm ultimos letra "a" e com Maiúscula
        Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama")
                .filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        System.out.println("------------------------------");

        //Imprimir nomes têm primeiro letra com maiuscula e ordem // 19 linha igual
        Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama")
                .filter(s -> s.startsWith("A"))
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(s -> System.out.println(s));
    }
}
