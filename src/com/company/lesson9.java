package com.company;

import java.util.Arrays;

public class lesson9 {
    public static void main(String[] args) {
        int[] mas1 = new int[]{1, 2, 3};
        int[] mas2 = new int[]{4, 5, 6, 7};

        int[] mas3 = method(mas1, mas2);

        System.out.println(Arrays.toString(mas3));

    }
      /*  String poloz = dlt(-10);
        System.out.println(poloz);
    }

    public static String dlt(int a) {
        if (a>0){
            return "+";
        }
        else {return "-";}*/

    public static int[] method(int[] arr1, int[] arr2) {
        int[] mas3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {

                mas3[i] = arr1[i];
            }
            for (int i = arr1.length, j=0; i < mas3.length; i++, j++) {
                mas3[i] = arr2[j];

            } return mas3;

        }

    }











