package ru.geekbrains.terentev.task01;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int SIZE = 3;

    private static char FREE_DOT = '#';
    private static char USER_DOT = 'X';
    private static char AI_DOT = '0';

    private static char[][] MAP;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        prepareMap();
        printMap();

        while (true) {
            playerTurn();
            if (checkWin(USER_DOT)) {
                System.out.println("User won!");
                break;
            }

            if (checkMapIsFull()) {
                System.out.println("Draw!");
            }

            aiTurn();
            if (checkWin(AI_DOT)) {
                System.out.println("AI won!");
                break;
            }
        }

        System.out.println("GAME OVER");
    }

    static void prepareMap() {
        MAP = new char[SIZE][SIZE];
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                MAP[x][y] = FREE_DOT;
            }
        }
    }

    static void printMap() {
        System.out.print(" ");
        for (int x = 0; x < SIZE; x++) {
            System.out.print(" " + (x+1));
        }
        System.out.println();

        for (int y = 0; y < SIZE; y++) {
            System.out.print(y+1);
            for (int x = 0; x < SIZE; x++) {
                System.out.print(" " + MAP[x][y]);
            }
            System.out.println();
        }
    }

    static boolean isDotFree(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return FREE_DOT == MAP[x][y];
    }

    static void playerTurn() {
        int x, y;

        do {
            System.out.println("Insert your turn coordinates in 'x y' format.");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isDotFree(x, y));

        MAP[x][y] = USER_DOT;
        printMap();
    }

    static void aiTurn() {
        int x, y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isDotFree(x, y));

        MAP[x][y] = AI_DOT;
        printMap();
    }

    static boolean checkMapIsFull() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (FREE_DOT == MAP[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin(char dot) {
        if (MAP[0][0] == dot && MAP[0][1] == dot && MAP[0][2] == dot) {
            return true;
        }

        if (MAP[1][0] == dot && MAP[1][1] == dot && MAP[1][2] == dot) {
            return true;
        }

        if (MAP[2][0] == dot && MAP[2][1] == dot && MAP[2][2] == dot) {
            return true;
        }

        if (MAP[0][0] == dot && MAP[1][0] == dot && MAP[2][0] == dot) {
            return true;
        }

        if (MAP[0][1] == dot && MAP[1][1] == dot && MAP[2][1] == dot) {
            return true;
        }

        if (MAP[0][2] == dot && MAP[1][2] == dot && MAP[2][2] == dot) {
            return true;
        }

        if (MAP[0][0] == dot && MAP[1][1] == dot && MAP[2][2] == dot) {
            return true;
        }

        if (MAP[2][0] == dot && MAP[1][1] == dot && MAP[0][2] == dot) {
            return true;
        }

        return false;
    }
}
