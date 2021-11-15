package com.company;

public class Car {
    String marka;
    int probeg;
    int speed;
    int price;

    Car() {

    }

    Car(String marka, int probeg, int price) {
        this.marka = marka;
        this.probeg = probeg;
        this.price=price;
    }
void gaz(){
        this.speed=60;
}
    void breaK(){
        this.speed=0;
    }
    Car(String name) {
        this.marka = marka;

    }

    public void getInfo() {
        System.out.println("marka:" + marka + ",probeg:" +
                probeg);
    }
}
