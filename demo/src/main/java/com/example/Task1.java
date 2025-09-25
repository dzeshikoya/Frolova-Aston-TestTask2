package com.example;

import java.util.Scanner;

public class Task1 {

    private static Integer numberA;
    private static Integer numberB;
    private static char equalitySign;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n Введите 2 целых числа");

        while(numberA == null && numberB == null){
            try{
                numberA = in.nextInt();
                numberB = in.nextInt();

            } catch(Error e){
                System.out.println("Ошибка. Введите 2 целых числа\n");
            }
        }

        if (numberA > numberB){ 
            equalitySign = '>';
        } else if (numberB > numberA){
            equalitySign = '<';
        } else{
            equalitySign = '=';
        }
        System.out.println(numberA + " " + equalitySign + " " + numberB + "\n");

        System.out.println(numberA + " + " + numberB + " = " + (numberA + numberB) + "\n");
        System.out.println(numberA + " - " + numberB + " = " + (numberA - numberB) + "\n");
        System.out.println(numberA + " * " + numberB + " = " + (numberA * numberB) + "\n");
        System.out.println(numberA + " : " + numberB + " = " + ((float) numberA / numberB) + "\n");
    }
}