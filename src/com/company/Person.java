package com.company;

public class Person {
           String name;
        int age;
        Car car;


        Person(){

        }
        Person(String name, int age, Car car){
            this.name=name;
            this.age=age;
            this.car=car;
        }
    Person(String name){
        this.name=name;

    }
    public void getInfo(){
        System.out.println("name:"+name+",age:"+
                age+ " Marka: " +car.marka+ " Probeg: " +car.probeg+ " Price: " + car.price);
    }
    }

