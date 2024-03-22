package com.jeferson.tempos.calendarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NomeMes {

    public static void main(String[] args) throws ParseException {
        atualMes();
        System.out.println("-------------------------");
        nomeDoMes(Calendar.MARCH);
        nomeDoMes(Calendar.NOVEMBER);
        nomeDoMes(Calendar.SEPTEMBER);
        System.out.println("-------------------------");
        alteradoDataMesAno();

    }

    private static void alteradoDataMesAno() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1992);
        c.set(Calendar.MONTH, Calendar.NOVEMBER);
        c.set(Calendar.DAY_OF_MONTH, 3);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Data/Hora atual: "+formato.format(c.getTime()));
        System.out.println("Data/Hora atual: "+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Mês: "+c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
    }

    private static void nomeDoMes(int mess) {
        String mes;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, mess);
        Date data = calendar.getTime();
        SimpleDateFormat nomeMes = new SimpleDateFormat("MMMM");
        mes = nomeMes.format(data);
        System.out.println(mes);
    }

    private static void atualMes() {
        String mes;
        Date data = new Date();
        SimpleDateFormat nomeMes = new SimpleDateFormat("MMMM");
        SimpleDateFormat siglaMes = new SimpleDateFormat("MMM");
        SimpleDateFormat numeroMes = new SimpleDateFormat("MM");
        mes = numeroMes.format(data);
        System.out.println("Numero do mes: " + mes);
        mes = siglaMes.format(data);
        System.out.println("Sigla do mes: " + mes);
        mes = nomeMes.format(data);
        System.out.println("Nome do mes: " + mes);
    }
}
