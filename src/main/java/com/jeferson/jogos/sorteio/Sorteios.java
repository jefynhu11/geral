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
                System.out.println("tipo 1");
                numeros.numeroAleatorioMinMax();
            } else if ( 2 == entrada) {
                System.out.println("tipo 2");
                numeros.insertNumSorteio();
            } else if (3 == entrada){
                start = false;
                System.out.println("Terminando...");
            } else {
                System.out.println("Invalido");
            }
//            start = startEnd.result();
        }
//        insertNumSorteio();
//        insertPalavraSorteio();
//        reajusteSorteio();
    }

    private static void insertNumSorteio() {
        int num [] = {6,7,8,11,15,18,19,20};

        Random random = new Random();

        int indiceSorteado = random.nextInt(num.length);

        int numeroSorteio = num[indiceSorteado];
        
        System.out.println("O número sorteado é: " + numeroSorteio);
    }

    private static void insertPalavraSorteio() {
        String chave [] = {"Jeferson", "Lopes", "Eugenio"};

        Random random = new Random();

        int indiceSorteado = random.nextInt(chave.length);

        String chaveSorteio = chave[indiceSorteado];

        System.out.println("A palavra sorteado é: " + chaveSorteio);
    }

    private static void reajusteSorteio() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanto numero para pode pegar sorteio: ");
        int numero = entrada.nextByte();
        System.out.print("Digite um numero minimo: ");
        int min = entrada.nextInt();
        System.out.print("Digite um numero maximo: ");
        int max = entrada.nextInt();
        System.out.println("Os numeros valores "+min+" e "+max+ ":");

        for ( int i = 0; i < numero; i++) {
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println("Sorteado é " + random_int);
        }

    }
}
