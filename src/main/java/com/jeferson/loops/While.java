package com.jeferson.loops;

public class While {
    public static void main(String[] args) {
        testWhile();
    }

    private static void testWhile() {
        int dez = 10;
        int conta = 0;
        while (true){
            conta++;
            System.out.println(conta);
            if(conta == dez){
                break;
            }
        }
    }
}
