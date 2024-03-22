package com.jeferson.tempos.calendarios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DiaMesAno {

    public static void main(String[] args) throws ParseException {
//        diaAtual();
//        obterDiaAtual();
//        obterMesAtual();
//        obterAnoAtual();
//        tiposLocalData();
        diaDaSemana();
    }

    private static void diaDaSemana() throws ParseException {
        int dia = 07;
        int mes = 07;
        int ano = 2021;
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = String.format("%s/%s/%s", dia, mes, ano);

        Date date = fmt.parse(dataFormatada);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
            System.out.println("SEGUNDA");
                break;
            case 3:
            System.out.println("TERÇA");
                break;
            case 4:
            System.out.println("QUARTA");
                break;
            case 5:
            System.out.println("QUINTA");
                break;
            case 6:
            System.out.println("SEXTA");
                break;
            case 7:
            System.out.println("SABADO");
                break;
        }
    }
        private static void tiposLocalData() {
        Date d = new Date();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("en", "US"));
        System.out.println("en: " + df1.format(d));

        DateFormat full = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
        DateFormat longs = DateFormat.getDateInstance(DateFormat.LONG, new Locale("pt", "BR"));
        DateFormat medium = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("pt", "BR"));
        DateFormat shorts = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("pt", "BR"));
        DateFormat defauls = DateFormat.getDateInstance(DateFormat.DEFAULT, new Locale("pt", "BR"));

        System.out.println("full pt: " + full.format(d));
        System.out.println("long pt: " + longs.format(d));
        System.out.println("medium pt: " + medium.format(d));
        System.out.println("short pt: " + shorts.format(d));
        System.out.println("defaul pt: " + defauls.format(d));
    }

    private static void obterMesAtual() {
        Calendar calendario = Calendar.getInstance();
        int mes = 1+calendario.get(Calendar.MONTH);
        System.out.println("Mes: " + mes);
    }

    private static void obterDiaAtual() {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        System.out.println("Dia: " + dia);
    }

    private static void obterAnoAtual() {
        Calendar calendario = Calendar.getInstance();
        int ano = calendario.get(Calendar.YEAR);
        System.out.println("Ano: " + ano);
    }

    private static void diaAtual() {
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data atual: " + formato.format(data));
    }
}
