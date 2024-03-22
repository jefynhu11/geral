package com.jeferson.tempos.programastempos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Hora {

    public static void main(String[] args) {
        horaAtual();
//        dataHora();
//        hora();
    }

    private static void dataHora() {
        Calendar c = Calendar.getInstance();
        c.set(2013, Calendar.FEBRUARY, 28);
        Date data = c.getTime();
        System.out.println("Data atual sem formatação: "+data);

        //Formata a data
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data atual com formatação: "+ formataData.format(data));

        //Formata Hora
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println("Hora formatada: "+hora.format(data));

        //Formata Data e Hora
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data));
    }

    private static void horaAtual() {
        Date dataHoraAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        System.out.println("SimpleDateFormat: " + formato.format(dataHoraAtual));
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println("DateFormat: " + hora.format(dataHoraAtual));

        Date dataHoraAtuals = new Date();
        String datas = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtuals);
        String horas = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtuals);
        System.out.println("Data: " + datas + " Hora: " + horas);
    }

    private static void hora(){
        Calendar calendar = Calendar.getInstance();
        Integer hora1 = calendar.get(Calendar.HOUR);
        Integer hora2 = calendar.get(Calendar.HOUR_OF_DAY);
        Integer min = calendar.get(Calendar.MINUTE);
        Integer seg = calendar.get(Calendar.SECOND);
        System.out.println("Horario1: " + hora1);
        System.out.println("Horario2: " + hora2);
        System.out.println("Min: " + min);
        System.out.println("Seg: " + seg);
    }
}
