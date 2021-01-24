package ru.geekbrains.terentev.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startTheGame(scanner);
    }

    private static void startTheGame(Scanner scanner) {
        int numberOfAttempts = 3;
        int guessNumber = (int) (Math.random()*10);
        System.out.println("I've guessed a number between 0 and 9! You got 3 attempts. Guess it!");
        int userNumber = 0;

        do {
            userNumber = scanner.nextInt();
            numberOfAttempts--;
            if (userNumber == guessNumber) {
                System.out.println("Lucky you! That's right!");
                break;
            } else {
                if (numberOfAttempts > 0) {
                    if (guessNumber < userNumber) {
                        System.out.println("Guessed number is less!");
                    } else {
                        System.out.println("Guessed number is greater!");
                    }
                } else {
                    System.out.println("Sorry, but you loose!");
                }
            }
        } while (numberOfAttempts > 0 && userNumber != guessNumber);

        System.out.println("Let's play again? 1 - yes / 2 - no");
        if (1 == scanner.nextInt()) {
            startTheGame(scanner);
        }
    }
}
