package ru.geekbrains.terentev.task04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[][] = {{2,3,4},{5,6,7},{8,9,0}};
        printMatrix(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length-1-i] = 1;
        }
        printMatrix(arr);
    }

    private static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
