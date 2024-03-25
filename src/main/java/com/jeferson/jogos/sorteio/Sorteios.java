package com.jeferson.jogos.sorteio;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorteios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Numeros numeros = new Numeros();
        Start startEnd = new Start();
        boolean start = true;

        while (start) {
            System.out.println("---------- SORTEIOS ----------");
            System.out.print("1-Numero aleatorio de MIN a MAX\n" +
                    "2-Escolhe numero para inserir\n" +
                    "3-Fim\n");
            System.out.println("------------------------------");

            int entrada = input.nextInt();
            if ( 1 == entrada) {
                numeros.numeroAleatorioMinMax();
            } else if ( 2 == entrada) {
                numeros.insertNumSorteio();
            } else if (3 == entrada){
                start = false;
                System.out.println("Terminando...");
            } else {
                System.out.println("Invalido");
            }
//            start = startEnd.result();
        }
    }

    private static void insertPalavraSorteio() {
        String chave [] = {"Jeferson", "Lopes", "Eugenio"};

        Random random = new Random();

        int indiceSorteado = random.nextInt(chave.length);

        String chaveSorteio = chave[indiceSorteado];

        System.out.println("A palavra sorteado é: " + chaveSorteio);
    }

}
