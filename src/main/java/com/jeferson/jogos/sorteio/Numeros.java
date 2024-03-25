package com.jeferson.jogos.sorteio;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Numeros extends Sorteios{

    public void numeroAleatorioMinMax() {
        Scanner input = new Scanner(System.in);
        boolean boo = true;

        while (boo) {
            System.out.print("Dirige um numero MIN: ");
            int min = input.nextInt();
            System.out.print("Dirige um numero MAX: ");
            int max = input.nextInt();
            if (max>=min){
                System.out.println("------------------------------");
                System.out.println("Os numeros partir "+min+" ate "+max+ ":");
                int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                System.out.println("------------------------------");
                System.out.println("O número sorteado é: " + random_int);
                boo = false;
            } else {
                System.out.println("Nao permite numero MIN maior do que numero MAX");
            }
        }
    }

    public void insertNumSorteio() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Quanto elemento: ");
        int aryNums [] = new int[input.nextInt()];

        for (int i = 0; i < aryNums.length; i++) {
            System.out.print((i + 1) + "° Inserir um numero: ");
            int numero = input.nextInt();

            boolean numeroExiste = false;
            for (int j = 0; j < i; j++) {
                if (aryNums[j] == numero) {
                    numeroExiste = true;
                    break;
                }
            }

            if (numeroExiste) {
                System.out.println("Número já existe, escolha outro.");
                i--;
            } else if (numero < 0) {
                System.out.println("Não pode ser negativo, escolha outro.");
                i--;
            } else {
                aryNums[i] = numero;
            }
            System.out.println("-->" + Arrays.toString(aryNums));
        }

        int indiceSorteado = random.nextInt(aryNums.length);
        int numeroSorteio = aryNums[indiceSorteado];
        System.out.println("O número sorteado é: " + numeroSorteio);

    }
}