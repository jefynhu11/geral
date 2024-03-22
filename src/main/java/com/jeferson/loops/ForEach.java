package com.jeferson.loops;

public class ForEach {
    public static void main(String[] args) {

        String [] sex = {"mas", "fem"};
        String [] age = {"0-5", "5-15", "15-50"};

        for ( String tipo : sex ) {
            System.out.println(tipo);
            if (tipo.equals("mas")) {
                System.out.println("é masculino");
            } else if (tipo.equals("fem")) {
                System.out.println("é feminino");
            } else if (tipo.equals(null)) {
                System.out.println("é vazio");
            }
        }
        int x = 0;
        int res = 2;
        for (String num : age) {
//            System.out.println(num);
            x++;
            if (x == res) {
                System.out.println(num);
            } else if (x == res) {
                System.out.println(num);
            } else if (x == res) {
                System.out.println(num);
            }
        }
    }
}
