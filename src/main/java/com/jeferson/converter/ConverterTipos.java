package com.jeferson.converter;

import javax.swing.*;

public class ConverterTipos {

    public static void main(String[] args) {

        StringToInt();
        IntToString();
        DoubleToString();
        StringToDouble();

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

    private static void DoubleToString() {
        double numero = 999;

        String numString1 = String.valueOf(numero);
        String numString2 = Double.toString(numero);
        System.out.println("double para String Tipo1: " + numString1);
        System.out.println("double para String Tipo2: " + numString2);
    }

    private  static void StringToDouble() {
        String numeroString = "321645";

        double numeroDouble1 = Double.parseDouble(numeroString);
        double numeroDouble2 = Double.valueOf(numeroString);
        System.out.println("String para double Tipo 1: " + numeroDouble1);
        System.out.println("String para double Tipo 2: " + numeroDouble2);
    }
}
