package com.jeferson.testes.fakers;

import com.github.javafaker.Faker;

import java.util.Locale;

public class NumeroCelular {
    static Faker faker = new com.github.javafaker.Faker(); // padrão
    static Faker fakerBr = new Faker(new Locale("pt-BR")); // especifico BRASILEIRO

    public static void main(String[] args) {
        System.out.println(fakerBr.phoneNumber().cellPhone());
        System.out.println(fakerBr.phoneNumber().phoneNumber());
        System.out.println(fakerBr.phoneNumber().subscriberNumber());
        System.out.println(fakerBr.phoneNumber().subscriberNumber(3));
        System.out.println(fakerBr.phoneNumber().extension());
    }
}
