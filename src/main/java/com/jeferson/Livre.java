package com.jeferson;

import javax.swing.*;
import java.util.Scanner;

public class Livre {

    public static void main( String[] args ) {

        int a,acu=0;
        Scanner entrada = new Scanner(System.in);
        while (entrada.hasNext()) {
            System.out.println("Digite um numero: ");
            a = entrada.nextInt();
            acu += a;
        }

        System.out.println("Soma é " + acu);

    }
}
