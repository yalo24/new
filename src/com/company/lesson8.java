package com.company;


public class lesson8 {
    public static void main(String[] args) {

  /*    int c= dlt (49, 7);
        System.out.println(c);
    }

    public static int dlt (int a, int b){
        System.out.println(a/b);
        return a / b;
    }
        dlt ();
    }

    public static void dlt() {
        System.out.println(800);
    }*/
               System.out.println(sum(one(), two(), three()));
    }

    public static int sum (int ...a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        return sum;
    }
        public static int one (){

        return 1;
    }
        public static int two (){

            return 2;
        }
        public static int  three(){

            return 3;
        }
}

