package com.jeferson.stream;

import java.util.ArrayList;

public class ExemploStream {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Jeferson");
        nomes.add("Idemar");
        nomes.add("Gelson");
        nomes.add("Eny");

        for (int i = 0; i<nomes.size(); i++) {
            String atual = nomes.get(i);
            if (atual.startsWith("J")){
                System.out.println("Iniciou a letra J");
            }
        }

    }
}
