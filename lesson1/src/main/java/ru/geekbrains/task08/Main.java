package ru.geekbrains.task08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type a year.");
        int a = sc.nextInt();
        System.out.println("Result of checking is year leap or not is " + isLeapYear(a));
    }

    public static boolean isLeapYear(int a) {
        return (a%400 == 0) || (!(a%100 == 0) && (a%4 == 0));
    }
}
