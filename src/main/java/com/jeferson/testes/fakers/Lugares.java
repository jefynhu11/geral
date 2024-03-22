package com.jeferson.testes.fakers;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Lugares {

    static Faker faker = new com.github.javafaker.Faker(); // padrão
    static Faker fakerBr = new Faker(new Locale("pt-BR")); // especifico BRASILEIRO

    public static void main(String[] args) {
        System.out.println(fakerBr.address().zipCode());
        System.out.println(fakerBr.address().stateAbbr());
        System.out.println(fakerBr.address().cityName());
        System.out.println(fakerBr.address().state());
        System.out.println(fakerBr.address().country());

    }

}
