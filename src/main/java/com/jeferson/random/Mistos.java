package com.jeferson.random;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.Random;

public class Mistos {
    public static void main(String[] args) {
//        alfanumerico();
//        numeroLetrasSimbolos();
//        letrasJapones();
        teste();
    }

    private static void alfanumerico() {
        System.out.println(RandomStringUtils.randomAlphanumeric(5));
    }

    private static void letrasJapones() {
        System.out.println(RandomStringUtils.random(7));
    }

    private static void numeroLetrasSimbolos() {
        System.out.println(RandomStringUtils.randomPrint(15));
    }

    private static void teste()  {
        Random gerador = new Random();
        int numeros [] = {0,2,4,6,8};
        //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" - "+gerador.nextBoolean());
        }
        for (int itens : numeros){
            System.out.println("="+itens);
        }
    }

}
