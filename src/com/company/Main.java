package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int min = 0;
        Random random = new Random();
        int[] mas1 = new int[15];
        int[] mas2 = new int[15];
        for (int i = 1; i <15; i++) {
            mas1[i]=random.nextInt(7) + 2;
            mas2[i]=random.nextInt(7) + 2;
           for (int j=i-1; j>=0;j--){
               if ((mas1[i]==mas2[i]&&mas1[j]==mas2[j]) || (mas1[i]==mas2[j]&&mas1[j]==mas2[i])) {
                   mas1[i]=random.nextInt(7) + 2;
                   mas2[i]=random.nextInt(7) + 2;
                   j++;
               }
            }

        }
    }
}






