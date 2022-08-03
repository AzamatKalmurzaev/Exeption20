package com.company;

public class Main extends Car {

    public static void main(String[] args) {

        Car car = new Car();
        try {
           car.drive();
           close();

        }catch (ArithmeticException a){
            System.out.println(a.getMessage());


        }



    }



    }






