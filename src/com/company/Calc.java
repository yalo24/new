package com.company;

public class Calc {
    double sum;
    double umn;
    double dlt;
    double mns;


    Calc(){

    }
    /*Calc( int sum, int umn, int dlt,int mns){
        this.sum=sum;
        this.umn=umn;
        this.dlt=dlt;
        this.mns=mns;
    }
    Calc(int sum){
        this.sum=sum;

    }*/

    public  double dlt (int a, int b){
        return a/b;
    }
    public double sum (int a, int b){
        return a+b;
    }
    public double umn (int a, int b){
        return a*b;
    }
    public  double mns (int a, int b){
        return a-b;
    }

}
