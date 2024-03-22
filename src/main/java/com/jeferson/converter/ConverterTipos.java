package com.jeferson.converter;

import javax.swing.*;

public class ConverterTipos {

    public static void main(String[] args) {

        StringToInt();
        IntToString();

    }

    private static void IntToString() {
        int nomeNumero = 11;

        String onze = Integer.toString(nomeNumero);

        System.out.println("Eu gosto de numero " + onze);

    }

    private static void StringToInt() {
        String numero = "25";

        int numeroConvertido = Integer.parseInt(numero);
        int numeroVezes2 = numeroConvertido * 2;

        System.out.println("Resultado: " + numeroVezes2);
    }
}
