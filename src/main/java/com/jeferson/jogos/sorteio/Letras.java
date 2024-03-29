package com.jeferson.jogos.sorteio;

import java.util.Random;
import java.util.Scanner;

public class Letras {

    public void insertPalavraSorteio() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.println("Quanto palavra que vai colocar: ");
            String chave [] = new String[input.nextInt()];
            String palavra;

            for (int i = 0; i < chave.length; i++) {
                System.out.println((i+1) + "° Digite uma palavra: ");
                palavra = input.nextLine();
                chave[i] = palavra;
            }

            int indiceSorteado = random.nextInt(chave.length);
            String chaveSorteio = chave[indiceSorteado];

            System.out.println("A palavra sorteado é: " + chaveSorteio);
        } catch (Exception e) {
            System.out.println("ERRO: ");
        }
    }

}
