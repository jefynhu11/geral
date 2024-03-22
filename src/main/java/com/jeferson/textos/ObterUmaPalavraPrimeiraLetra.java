package com.jeferson.textos;

public class ObterUmaPalavraPrimeiraLetra {
    public static void main(String[] args) {
//        pegaUmParteLetra();
        tiraPrimeiroPalavra();
    }

    private static void tiraPrimeiroPalavra() {
        String nameFull = "Jeferson Lopes Eugenio";
        String primeiraLetra = nameFull.substring(nameFull.indexOf(" "));
        System.out.println("Nome completo: " + nameFull);
        System.out.println("Nome: " + primeiraLetra);
    }

    private static void pegaUmParteLetra() {
        String nome = "JefersonLopesEugenio";
        String[] split1 = nome.split("n");
        System.out.println(split1[1]);
    }
}
