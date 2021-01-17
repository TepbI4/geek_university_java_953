package ru.geekbrains.task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter integer 'a' value: ");
        int a = sc.nextInt();

        System.out.println("Please, enter integer 'b' value: ");
        int b = sc.nextInt();

        System.out.println("Is 10 <= 'a+b' <= 20: " + isSumMoreThanTenAndLessThanTwenty(a, b));
    }

    private static boolean isSumMoreThanTenAndLessThanTwenty(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }
}
