package ru.geekbrains.terentev.task05;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 31, 45, 18, 0, -25, 10};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }

        System.out.println("Minimum value in array is: " + min);
        System.out.println("Maximum value in array is: " + max);
    }
}
