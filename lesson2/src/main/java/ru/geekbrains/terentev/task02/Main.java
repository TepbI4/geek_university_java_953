package ru.geekbrains.terentev.task02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3 * i;
        }

        System.out.println(Arrays.toString(arr));
    }
}
