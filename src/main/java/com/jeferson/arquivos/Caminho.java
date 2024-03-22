package com.jeferson.arquivos;

import java.io.File;

public class Caminho {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        String dir1 = System.getProperty("user.dir");
        String dir2 = System.getProperty("user.dir") + File.separator + "src" + File.separator + "java" + File.separator + "com.jeferson";
        String teste = dir1 + File.separator + "src" + File.separator + "java" + File.separator + "com.jeferson";
        System.out.println(home);
        System.out.println("1: " + dir1);
        System.out.println("2: " + dir2);
        System.out.println("---------------------");
        System.out.println(teste);

//        System.out.println(System.getProperty("user.dir" + File.separator + "src" + File.separator + "java" +
//                File.separator + "com.jeferson"));
    }
}
