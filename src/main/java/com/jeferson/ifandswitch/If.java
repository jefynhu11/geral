package com.jeferson.ifandswitch;

public class If {
    public static void main(String[] args) {
        ifIgualString();
        ifIgualInt(11);
    }

    private static void ifIgualInt(int num) {

        if (num == 11){
            System.out.println("igual");
        } else {
            System.out.println("nao igual");
        }

        if (num == 10){
            System.out.println("dez");
        } else if (num == 12) {
            System.out.println("doze");
        } else if (num == 15) {
            System.out.println("quinze");
        } else {
            System.out.println("invalido");
        }
    }

    private static void ifIgualString() {
        String test1 = "teste";
        String test2 = "tesT";

        if (test1 == "teste"){
            System.out.println("DEU TESTE");
        } else {
            System.out.println("NAO DEU TESTE");
        }

        if (test2.equalsIgnoreCase("test")){
            System.out.println("DEU TEST");
        }else {
            System.out.println("NAO DEU TEST");
        }
    }
}
