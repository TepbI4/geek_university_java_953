package ru.geekbrains.terentev.task02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[] words = {"apple", "orange", "lemon",
                                    "banana", "apricot", "avocado",
                                    "broccoli", "carrot", "cherry",
                                    "garlic", "grape", "melon",
                                    "leak", "kiwi", "mango",
                                    "mushroom", "nut", "olive",
                                    "pea", "peanut", "pear",
                                    "pepper", "pineapple", "pumpkin",
                                    "potato"};

    public static void main(String[] args) {
        String guessedWord = words[(int) (Math.random()*26)];
        Scanner scanner = new Scanner(System.in);
        do {
            String answer = "###############";
            char[] answerArray = answer.toCharArray();
            System.out.println("Enter a word.");
            String userWord = scanner.nextLine();
            if (guessedWord.equals(userWord)) {
                System.out.println("Lucky you! That's right!");
                break;
            } else {
                int minLength = guessedWord.length() <= userWord.length() ? guessedWord.length() : userWord.length();
                for (int i = 0; i < minLength; i++) {
                    if (guessedWord.charAt(i) == userWord.charAt(i)) {
                        answerArray[i] = guessedWord.charAt(i);
                    }
                }
                System.out.println(new String(answerArray));
            }
        } while (true);
    }
}
