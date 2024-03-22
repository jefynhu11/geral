package com.jeferson.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Jeferson");
        nomes.add("Idemar");
        nomes.add("João");
        nomes.add("Gelson");
        nomes.add("John");
        nomes.add("Eny");

        int count = 0;

        for (int i = 0; i<nomes.size(); i++) {
            String atual = nomes.get(i);
            if (atual.startsWith("J")){
                count++;
            }
        }

        System.out.println("->"+count);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Jeferson");
        names.add("Idemar");
        names.add("Gelson");
        names.add("Eny");
        names.add("John");

        Long num = names.stream().filter(s -> s.startsWith("J")).count(); //18,19 e 20 linhas são iguais
        System.out.println("-->"+num);
        // ou podemos fazer assim
        Long cont = Stream.of("Jeferson", "Idemar","Gelson","Eny","John").filter(s -> {
            s.startsWith("J");
            return true;
        }).count();
        System.out.println("--->"+cont);
        names.stream().filter(s -> s.length()>4).forEach(s -> System.out.println("---->"+s)); // imprimir quatidade letra passar
        System.out.println("---------------------------------");
        names.stream().filter(s -> s.length()>4).limit(2).forEach(s -> System.out.println("---->"+s)); // imprimir quatidade linhas limite

    }
}
