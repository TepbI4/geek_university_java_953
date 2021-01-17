package ru.geekbrains.task07;

import java.util.Scanner;

public class Main {

    private static final String TEMPLATE = "Hellow, %s!";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type your name.");
        String str = sc.nextLine();

        System.out.println(sayHellow(str));
    }

    private static String sayHellow(String str) {
        return String.format(TEMPLATE, str);
    }
}
