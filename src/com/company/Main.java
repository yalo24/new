package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Person person= new Person("Jon", 35,  new Car("Opel", 3,10000));
        Person person1= new Person("Jon1", 35, new Car("Mazda", 10,3000));
        Person person3= new Person("alex", 20, new Car("Mersedes", 5,15000));
        Person person4= new Person("Pit", 40, new Car("Lada", 15,150));
        Person person5= new Person("Tim", 21, new Car("Porshe", 8,13000));
        person.getInfo();
       Person[] masPers = {person, person1, person3, person4, person5};



        System.out.println(person.name);
       System.out.println(person.age);
        Car car= new Car("Opel", 3,10000);
        Car car1= new Car("Mazda", 10,3000);
        car.getInfo();


        System.out.println(car.marka);
        System.out.println(car.probeg);
        System.out.println(car.price);
        System.out.println(car.speed);
        car.gaz();
        System.out.println(car.speed);
        car.breaK();
        System.out.println(car.speed);



        /*int[][] array = new int[5][5];
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
               }*/
            }

        }








