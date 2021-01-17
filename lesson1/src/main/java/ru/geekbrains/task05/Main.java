package ru.geekbrains.task05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter integer 'a' value: ");
        int a = sc.nextInt();

        signum(a);
    }

    private static void signum(int a) {
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
