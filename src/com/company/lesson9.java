package com.company;

import java.util.Arrays;

public class lesson9 {
    public static void main(String[] args) {
        int[] mas1 = new int[]{1, 2, 3, 8, 10};
        int[] mas2 = new int[]{4, 5, 6, 7};
        int sum = methodsum(mas1);
        System.out.println(sum);


    }
      /*  String poloz = dlt(-10);
        System.out.println(poloz);
    }

    public static String dlt(int a) {
        if (a>0){
            return "+";
        }
        else {return "-";}*/

  /* public static int[] method(int[] mas1, int[] mas2) {
       public static int methodsum (int[] mas1) {
           int sum=0;
        int[] mas3 = new int[mas1.length + mas2.length];
        for (int i = 0; i < mas1.length; i++) {
            sum =sum+ mas1[i];

              } return sum;

                mas3[i] = mas1[i];
            }
            for (int i = mas1.length, j=0; i < mas3.length; i++, j++) {
                mas3[i] = mas2[j];

            } return mas3;*/

   public static int methodsum(int[] mas1) {
        int sum=0;
              for (int i = 0; i < mas1.length; i++) {

                  sum =sum+ mas1[i];

              } return sum;

        }

    }











