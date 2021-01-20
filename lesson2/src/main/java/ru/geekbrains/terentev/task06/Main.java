package ru.geekbrains.terentev.task06;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, -2, 10};
        System.out.println(checkBalance(arr));
    }

    private static boolean checkBalance(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int j = 0; j < i; j++) {
                sumLeft = sumLeft + arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                sumRight = sumRight + arr[j];
            }

            if (sumLeft == sumRight) return true;
        }

        return false;
    }
}
