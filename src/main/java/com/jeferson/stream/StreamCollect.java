package com.jeferson.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

    public static void main(String[] args) {

        List<String> letter = Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama")
                .filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(letter.get(0));
//        System.out.println(letter);

        System.out.println("------------------");

        List<Integer> valor = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);

        //Imprimir numero não repetir
        valor.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("------------------");

        //Imprimir numero nao repetir e ordem
        valor.stream().distinct().sorted().forEach(s -> System.out.println(s));

        System.out.println("------------------");

        //Faz array numero
        List<Integer> list = valor.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(list); //Imprimir todos
        System.out.println(list.get(3)); //Imprimir 5

    }
}
