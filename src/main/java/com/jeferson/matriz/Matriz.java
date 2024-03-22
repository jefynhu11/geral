package com.jeferson.matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
//        escolheNumeroMatriz();
        definidoMatriz();
    }

    private static void escolheNumeroMatriz() {
        Scanner scanner = new Scanner(System.in);
        int linhas = 0;
        int colunas = 0;

        System.out.println("Digite os elementos da matriz (digite 'fim' para encerrar a entrada):");

        while (true) {
            String linha = scanner.nextLine();
            if (linha.equalsIgnoreCase("fim")) {
                break;
            }
            String[] elementos = linha.split(" ");
            if (colunas == 0) {
                colunas = elementos.length;
            } else if (elementos.length != colunas) {
                System.out.println("Número inválido de elementos. Todos devem ter o mesmo número de elementos.");
                continue;
            }
            linhas++;
        }

        System.out.println("O número de linhas é: " + linhas);
        System.out.println("O número de colunas é: " + colunas);

        scanner.close();
    }

    private static void definidoMatriz() {
        Scanner scanner = new Scanner(System.in);
        int linhas = 3; // Definindo o número de linhas como 3
        int colunas = 3; // Definindo o número de colunas como 3

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int elemento = scanner.nextInt();
                // Aqui você pode fazer algo com o elemento, se necessário
            }
        }

        System.out.println("O número de linhas é: " + linhas);
        System.out.println("O número de colunas é: " + colunas);

        scanner.close();
    }
}
