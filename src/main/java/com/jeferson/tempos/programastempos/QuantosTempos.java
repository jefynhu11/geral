package com.jeferson.tempos.programastempos;

import java.time.Duration;

public class QuantosTempos {

    public static void main(String[] args) {
        colocarQuantosHorasIgualQue(2);
        System.out.println("------------------------------");
        colocarQuantosMinutosIgualQue(30);
        System.out.println("------------------------------");
        colocarQuantosSegundosIgualQue(180);
    }

    private static void colocarQuantosMinutosIgualQue(int num) {
        Duration total = Duration.ofMinutes(num);

        int horas = (int) total.toHours();
        int segundos = (int) total.toSeconds();

        System.out.println("Quantos minutos que você colocou: " + total.toMinutes() + " MINUTOS");
        System.out.println("Horas igual a horas: " + horas + " horas");
        System.out.println("Horas igual a segundos: " + segundos + " segundos");

    }

    private static void colocarQuantosHorasIgualQue(int num) {
        Duration total = Duration.ofHours(num);

        int minutos = (int) total.toMinutes();
        int segundos = (int) total.toSeconds();

        System.out.println("Quantos horas que você colocou: " + total.toHours() + " HORAS");
        System.out.println("Horas igual a minutos: " + minutos + " minutos");
        System.out.println("Horas igual a segundos: " + segundos + " segundos");

    }

    private static void colocarQuantosSegundosIgualQue(int num) {
        Duration total = Duration.ofSeconds(num);
        int horas = total.toHoursPart();
        int minutos = total.toMinutesPart();

        System.out.println("Quantos segundos que você colocou: " + total.getSeconds() + " SEGUNDOS");
        System.out.println("Segundos igual a horas: " + horas + " horas");
        System.out.println("Segundos igual a minutos: " + minutos + " minutos");

//        System.out.printf("1 - %d horas, %d minutos e %d segundos\n", total.toHoursPart(), total.toMinutesPart(), total.toSecondsPart());
//        System.out.printf("2 - %d horas, %d minutos e %d segundos\n", total.toHours(), total.toMinutes(), total.toSeconds());
    }
}
