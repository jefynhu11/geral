package com.jeferson.ifandswitch;

public class Switch {
    public static void main(String[] args) {
        switchString("C", "A");
    }

    private static void switchString(String letra, String segundaLetra) {
        switch (letra){
            case "A":
                System.out.println("AAAAAAAAAA");
                switch (letra+segundaLetra){
                    case "AB":
                        System.out.println("ACABAXI");
                        break;
                    case "AC":
                        System.out.println("ACEITAR");
                        break;
                    case "AD":
                        System.out.println("ADICIONAR");
                        break;
                    default:
                        System.out.println("NADA");
                        break;
                }
                break;
            case "B":
                System.out.println("BBBBBBBBBB");
                switch (letra+segundaLetra){
                    case "BA":
                        System.out.println("BAXIAR");
                        break;
                    case "BB":
                        System.out.println("Banco Brasil");
                        break;
                    case "BC":
                        System.out.println("Beto Carrero");
                        break;
                    default:
                        System.out.println("NADA");
                        break;
                }
                break;
            case "C":
                System.out.println("CCCCCCCCC");
                switch (letra+segundaLetra){
                    case "CA":
                        System.out.println("CARRO");
                        break;
                    case "CB":
                        System.out.println("CB300");
                        break;
                    case "CC":
                        System.out.println("Capao Canoa");
                        break;
                    default:
                        System.out.println("NADA");
                        break;
                }
                break;
            default:
                System.out.println("nao é alfabeto");
                break;

        }
    }
}
