package com.jeferson.array;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
//        arrayAdd();
        sorteioArray();
    }

    private static void arrayAdd() {
        ArrayList list = new ArrayList();
        list.add(new Double(3.141));
        list.add(new Integer(200));
        list.add(new String("Jeferson"));
        System.out.println(list);
    }

    private static void sorteioArray() {
        int numeros [] = {0,2,4,6,8};
        System.out.println(numeros[2]);
        for (int sorteio : numeros) {
            System.out.println(sorteio);
        }
    }
}
