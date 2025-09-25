package com.example;

import java.util.Scanner;

public class Task1 {

    private static Integer numberA;
    private static Integer numberB;
    private static char equalitySign;
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n Введите 2 целых числа");

        while(numberA == null && numberB == null){
            try{
                numberA = in.nextInt();
                numberB = in.nextInt();

            } catch(Exception e){
                System.out.println("Ошибка. Введите 2 целых числа\n");
                numberA = null;
                numberB = null;
                in.nextLine();

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
        if (numberB != 0) {
            System.out.println(numberA + " : " + numberB + " = " + ((float) numberA / numberB) + "\n");
        }
        else{
            System.out.println("нельзя делить " + numberA + " на 0" + "\n");  
        }

        in.close();
    }
}