package ru.geekbrains.terentev.task01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                continue;
            }

            if (arr[i] == 1) {
                arr[i] = 0;
                continue;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
