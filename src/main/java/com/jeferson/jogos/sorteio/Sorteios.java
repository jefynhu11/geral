package com.jeferson.jogos.sorteio;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Sorteios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Numeros numeros = new Numeros();
        boolean start = true;

        try {
            while (start) {
                System.out.println("---------- SORTEIOS ----------");
                System.out.print("1-Numero aleatorio de MIN a MAX\n" +
                        "2-Escolhe numero para inserir\n" +
                        "3-Fim\n");
                System.out.println("------------------------------");

                String entrada = input.nextLine();

                if (entrada.length() > 9) {
                    throw new InputMismatchException("Número limite 9 dígitos");
                }

                int numero = Integer.parseInt(entrada);
                System.out.println("Número digitado: " + numero);

                if ( 1 == numero) {
                    numeros.numeroAleatorioMinMax();
                } else if ( 2 == numero) {
                    numeros.insertNumSorteio();
                } else if (3 == numero){
                    start = false;
                    System.out.println("Terminando...");
                } else {
                    System.out.println("Invalido");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite uma quantidade dentro do limite permitido.");
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Não digite letra ou simbolo, somente número inteiro.");
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
