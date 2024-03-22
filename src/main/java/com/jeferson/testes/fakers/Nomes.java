package com.jeferson.testes.fakers;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Nomes {

    static Faker faker = new com.github.javafaker.Faker(); // padrão
    static Faker fakerBr = new Faker(new Locale("pt-BR")); // especifico BRASILEIRO

    public static void main(String[] args) {
        System.out.println(fakerBr.name().fullName()); // nome do completo
        System.out.println(fakerBr.name().firstName()); // primeiro do nome
        System.out.println(fakerBr.name().lastName()); // ultimo do sobrenome
        System.out.println(fakerBr.name().name());
        System.out.println(fakerBr.name().prefix()); // Dra, Sra, Dr, Dra
        System.out.println(fakerBr.name().suffix()); // parece ultimo sobrenome
        System.out.println(fakerBr.name().bloodGroup()); // tipos sangue
        System.out.println(fakerBr.name().nameWithMiddle()); // parece que nome completo tambem
        System.out.println(fakerBr.name().title()); // nome do titulo qualquer
        System.out.println(fakerBr.name().username()); // nome do usuario
    }
}
