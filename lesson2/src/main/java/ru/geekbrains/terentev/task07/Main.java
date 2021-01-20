package ru.geekbrains.terentev.task07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = -2;
        rotate(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int n) {
        int iter = n % arr.length;
        int temp = 0;

        if (iter == 0) return;

        if (iter > 0) {
            for (int i = 0; i < iter; i++) {
                temp = arr[arr.length - 1];
                for (int j = arr.length - 2; j >= 0 ; j--) {
                    arr[j+1] = arr[j];
                }
                arr[0] = temp;
            }
        } else {
            for (int i = iter; i < 0; i++) {
                temp = arr[0];
                for (int j = 1; j < arr.length; j++) {
                    arr[j-1] = arr[j];
                }
                arr[arr.length - 1] = temp;
            }
        }
    }
}
