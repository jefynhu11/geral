package com.jeferson.testes.fakers;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Internet {
    static Faker faker = new com.github.javafaker.Faker(); // padrão
    static Faker fakerBr = new Faker(new Locale("pt-BR")); // especifico BRASILEIRO

    public static void main(String[] args) {
        System.out.println(fakerBr.internet().emailAddress()); // alterar email
        System.out.println(fakerBr.internet().emailAddress("jefynhu")); //inicio nome email e dominio altera
        System.out.println(fakerBr.internet().safeEmailAddress()); // alterar email e dominio mesmo padrao @exemplo
        System.out.println(fakerBr.internet().safeEmailAddress("lol")); // inicio nome email e dominio mesmo padrao @exemplo
        System.out.println(fakerBr.internet().password()); // numero e letra
        System.out.println(fakerBr.internet().password(6,8)); // min e max, numero e letra
        System.out.println(fakerBr.internet().password(3,5,true)); // min e max, numero e letra incluir maiuscula
        System.out.println(fakerBr.internet().password(9,10,true, true)); // min e max, numero e letra incluir maiuscula e especiais
        System.out.println(fakerBr.internet().ipV4Address()); // ip
        System.out.println(fakerBr.internet().ipV6Address()); // ip com letra
        System.out.println(fakerBr.internet().avatar()); //site
        System.out.println(fakerBr.internet().domainName());
        System.out.println(fakerBr.internet().domainSuffix());
        System.out.println(fakerBr.internet().domainWord());
        System.out.println(fakerBr.internet().image());
        System.out.println(fakerBr.internet().slug());
        System.out.println(fakerBr.internet().url());
        System.out.println(fakerBr.internet().userAgentAny());
        System.out.println(fakerBr.internet().uuid());

    }
}
