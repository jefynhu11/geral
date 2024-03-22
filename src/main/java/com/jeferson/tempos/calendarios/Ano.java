package com.jeferson.tempos.calendarios;

import java.util.Calendar;

public class Ano {

    public static void main(String[] args) {
//        anoAtual();
        inserirAno();
    }

    private static void inserirAno() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1992);
        System.out.println("Ano: " + c.getWeekYear());
    }

    private static void anoAtual() {
        Calendar calendario = Calendar.getInstance();
        int ano = calendario.get(Calendar.YEAR);
        System.out.println("Ano: " + ano);
    }
}
