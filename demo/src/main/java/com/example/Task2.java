package com.example;

import java.util.Scanner;

public class Task2 {
  private static String stringA;
  private static String stringB;
  private static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("\n Введите строку 1");
    stringA = in.nextLine();

    System.out.println("\n Введите строку 2");
    stringB = in.nextLine();

    if (stringA.equals(stringB)){
      System.out.println("\n Строки идентичны");
    }
    else{
      System.out.println("\n Строки неидентичны");
    }

    in.close();

  }
}
