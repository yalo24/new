package com.company;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Shape square= new Square(4);
        Shape triug= new Triug(5, 4);
        Shape circle= new Circle(5);
        square.draw();
        triug.draw();
        circle.draw();


        Father father;
        father = new Father("Jon");
        Son son = new Son("Sam");
        father.Poz();
        System.out.println(father.Poz());
        System.out.println(son.Poz());
    }
}

      /*  System.out.println(Human.poz);
        System.out.println(calc.sum(10, 15));}
        Calc calc= new Calc ();
        System.out.println(calc.sum(10, 15));}
        
       Person person = new Person("Jon", 35, new Car("Opel", 3, 10000));
        Person person1 = new Person("Jon1", 35, new Car("Mazda", 10, 3000));
        Person person3 = new Person("alex", 20, new Car("Mersedes", 5, 15000));
        Person person4 = new Person("Pit", 40, new Car("Lada", 15, 150));
        Person person5 = new Person("Tim", 21, new Car("Porshe", 8, 13000));
        person.getInfo();
        Person[] masPers = {person, person1, person3, person4, person5};
       Pets[] pets1=new Pets[]{
               new Pets("cat"),
               new Pets("snace"),
               new Pets("dog"),
       };




        int dor = 0;
        String dorPers = null;
        for (int i = 0; i < masPers.length; i++) {
            if (dor < masPers[i].car.price) {
                dor = masPers[i].car.price;
                dorPers = masPers[i].name;
            }
        }
            System.out.println("Name "+dorPers + " dor: "+dor);}

          /*  System.out.println(person.name);
            System.out.println(person.name);
            System.out.println(person.age);
            Car car = new Car("Opel", 3, 10000);
            Car car1 = new Car("Mazda", 10, 3000);
            car.getInfo();

            System.out.println(car.marka);
            System.out.println(car.probeg);
            System.out.println(car.price);
            System.out.println(car.speed);
            car.gaz();
            System.out.println(car.speed);
            car.breaK();
            System.out.println(car.speed);



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
               }*/












