package com.jeferson.jogos.sorteio;

import java.util.Scanner;

public class Start {

    public Boolean result() {
        Scanner input = new Scanner(System.in);
        Numeros numeros = new Numeros();
        boolean start, boo = true;

        while (boo){
            System.out.println("Continua o sorteio? [1] SIM [2] NAO");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Continua o sorteio");
                    boo = false;
                    numeros.insertNumSorteio();
//                        System.out.println("Novo[1] ou Mesmo[2]?");
//                        if (){
//
//                        };
                    return true;
//                    break;
                case 2:
                    System.out.println("Encerra o sorteio");
                    boo = false;
                    return false;
//                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }
        }
        return null;
    }

}
