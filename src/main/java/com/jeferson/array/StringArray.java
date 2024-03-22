package com.jeferson.array;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.Random;

public class StringArray {
    public static void main(String[] args) {
//        stringTest();
//        stringBasic();
        stringImprimir();
    }

    private static void stringImprimir() {
        int x;
        String [] value = new String[3];
        for ( int i = 0; i<value.length; i++){
            value[i] = RandomStringUtils.randomAlphabetic(4);
        }
        System.out.println("Teste: " + value[0]);
        System.out.println("Teste0: " + Arrays.toString(value));
        System.out.println("Teste1: " + Arrays.toString(new String[]{value[0]}));
        System.out.println("Teste2: " + Arrays.toString(new String[]{value[1]}));
        System.out.println("Teste3: " + Arrays.toString(new String[]{value[2]}));
    }

    private static void stringBasic() {
        String [] strArr = new String[] {"1", "2", "3"};
        String str = strArr.toString();
        System.out.println("Java String array para String = " + str.toString());
    }

    private static void stringTest() {
        String [] frutas = new String[] {"banana", "maca", "laranja", "mamao", "limao"};
        Arrays.asList(frutas).contains("maca"); // true
        Arrays.asList(frutas).indexOf("maca"); // 2
        Arrays.asList(frutas).contains("pera"); // false
        Arrays.asList(frutas).indexOf("pera"); // -1
    }
}
