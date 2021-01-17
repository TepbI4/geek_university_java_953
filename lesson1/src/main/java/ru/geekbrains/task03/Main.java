package ru.geekbrains.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type 'a' value: ");
        float a = sc.nextFloat();

        System.out.println("Type 'b' value: ");
        float b = sc.nextFloat();

        System.out.println("Type 'c' value: ");
        float c = sc.nextFloat();

        float d = readDValue(sc);

        System.out.println("Result value of 'a * (b + (c / d))' is: " + compute(a, b, c, d));
    }

    private static float compute(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static float readDValue(Scanner sc) {
        System.out.println("Type non 0 'd' value: ");
        float d = sc.nextFloat();
        if (d == 0) {
            System.out.println("'d' value is 0!");
            readDValue(sc);
        }

        return d;
    }
}
