package com.jeferson.array;

import java.util.Arrays;

public class IntegerArray {
    public static void main(String[] args) {
//        arraysAeB();
        arraysTest();
    }

    private static void arraysTest() {
        int [] aryNums;
        aryNums = new int[6];
        aryNums[0] = 10;
        aryNums[1] = 14;
        aryNums[2] = 36;
        aryNums[3] = 27;
        aryNums[4] = 43;
        aryNums[5] = 18;

        System.out.println(aryNums[3]);
    }

    private static void arraysAeB() {
        int [] A = {4, 11, 2, 1, 3, 5, 7};
        int [] B = {5, 2, 3, 15, 1, 0, 9};

        System.out.println("Integer Array A: " + Arrays.toString(A));
        System.out.println("Integer Array B: " + Arrays.toString(B));
    }
}
