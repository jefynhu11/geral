package com.jeferson.testes.fakers;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.UUID;

public class Numeros {
    static Faker faker = new com.github.javafaker.Faker(); // padrão
    static Faker fakerBr = new Faker(new Locale("pt-BR")); // especifico BRASILEIRO

    public static void main(String[] args) {
        System.out.println("1) "+fakerBr.number().digit());
        System.out.println("2) "+fakerBr.number().digits(4)); //controla quantidade numero
        System.out.println("3) "+fakerBr.number().numberBetween(200,220)); //numero min e max
        System.out.println("4) "+fakerBr.number().randomDigit());
        System.out.println("5) "+fakerBr.number().randomDigitNotZero()); // numero não 0
        System.out.println("6) "+fakerBr.number().randomNumber());

        alfanumero1();
    }

    private static void alfanumero1() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println(uuid);
    }
}
