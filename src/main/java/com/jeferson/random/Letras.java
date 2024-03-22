package com.jeferson.random;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Letras {
    public static void main(String[] args) {
        randomLetras();
    }

    private static void randomLetras() {
        System.out.println(RandomStringUtils.randomAlphabetic(10));
    }
}
