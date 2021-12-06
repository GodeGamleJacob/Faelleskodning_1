package com.company;

import java.util.Scanner;

public class Calculator {
    //Instansvariabel
    private int result;
    private int x;
    private int y;

    //Regnemaskinen
    public Calculator() {
    }
    public Calculator(int x, int y) {
        Scanner input = new Scanner(System.in);
        int math = input.nextInt();
        this.x = x;
        this.y = y;
        switch (math) {

            case (1):
                System.out.println(plus(x, y));
            break;
            case (2):
                System.out.println(minus(x, y));
            break;
            case (3):
                System.out.println(multiplication(x, y));
            break;
            case (4):
                System.out.println(division(x, y));
            break;
        }
    }
        //------------------------------------------------------------------------------------------------------------------

        //Udregningsmetoderne til regnemaskinen
        public int plus ( int no1, int no2){
            int result = no1 + no2;

            return result;
        }

        public int minus ( int no1, int no2){
            int result = no1 - no2;

            return result;
        }

        public int multiplication ( int no1, int no2){
            int result = no1 * no2;

            return result;
        }

        public int division ( int no1, int no2){
            int result = no1 / no2;

            return result;
        }
}