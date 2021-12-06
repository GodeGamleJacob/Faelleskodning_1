package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator regnemaskine = new Calculator();
        //regnemaskine.plus(5,13);
        System.out.println(regnemaskine.plus(5,13));
        Calculator regnemaskinen = new Calculator(2,6);
    }
}
