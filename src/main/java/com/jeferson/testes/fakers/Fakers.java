package com.jeferson.testes.fakers;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Fakers {

    static Faker faker = new com.github.javafaker.Faker(); // padrão
    static Faker fakerBr = new Faker(new Locale("pt-BR")); // especifico BRASILEIRO

    public static void main(String[] args) {
        System.out.println(fakerBr.color().name());
        System.out.println(fakerBr.random().nextInt(5));
        System.out.println(fakerBr.random().nextInt(10,15));
        System.out.println(fakerBr.date().birthday());
        System.out.println(fakerBr.date().birthday(22,29));
        System.out.println(fakerBr.esports().game());
        System.out.println(fakerBr.esports().league());
        System.out.println(fakerBr.esports().player());
        System.out.println(fakerBr.esports().team());
        System.out.println(fakerBr.team().name());
        System.out.println(fakerBr.team().state());
        System.out.println(fakerBr.team().sport());
    }

}
