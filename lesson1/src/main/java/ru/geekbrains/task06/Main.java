package ru.geekbrains.task06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter integer 'a' value: ");
        int a = sc.nextInt();

        System.out.println(signum(a));
    }

    private static boolean signum(int a) {
        return a >= 0;
    }
}
