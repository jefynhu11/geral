package com.jeferson.loops;

public class For {
    public static void main(String[] args) {

        testeFor();
        forWithIf();

    }

    private static void forWithIf() {
        String produto[] = new String[2];
        int itens[] = new int[2];

        produto[0] = "Jeferson";
        produto[1] = "Lopes";

        itens[0] = 8;
        itens[1] = 15;

        for (String nome : produto){
            System.out.println(nome);
        }
        for (int quantidade : itens) {
            System.out.println(quantidade);
        }

        for (int i=0; i<produto.length; i++){
            if (produto[i].equals("Jeferson")){
                System.out.println("certo");
            }else{
                System.out.println("errado");
            }
        }
    }

    public static void testeFor(){
        for (int i = 1;  i<=5; i++){
            System.out.println( i+"-Hello World!" );
        }
    }
}
