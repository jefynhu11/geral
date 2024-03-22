package com.jeferson.loops;

public class DoWhile {
    public static void main(String[] args) {
        doWhile();
//        whileTest();
    }

    private static void whileTest() {
        int i = 0;
        while ( i != 10) {
            i++;
            System.out.println(i);
        }
    }

    private static void doWhile() {
        // meu entendimento, do while quer saber falso, qnd encontra falso, fim loop8
        int i = 0;
        do {
            System.out.println(i);
            ++i;
            System.out.println(i);
//        } while (i <= 10);
        } while (i != 2);
    }
}
