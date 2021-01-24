package ru.geekbrains.terentev.task02;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int SIZE = 3;

    private static char FREE_DOT = '#';
    private static char USER_DOT = 'X';
    private static char AI_DOT = '0';

    private static char DOWN = 'd';
    private static char SIDE = 's';

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
        int mainDiag = 0;
        int secondaryDiag = 0;

        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][i] == dot) {
                mainDiag++;
            }

            if (MAP[i][(SIZE - 1) - i] == dot) {
                secondaryDiag++;
            }
        }

        if (mainDiag == SIZE) return true;
        if (secondaryDiag == SIZE) return true;

        return checkWinInDirection(0, DOWN, dot) || checkWinInDirection(0, SIDE, dot)
                || checkWinInDirection(1, DOWN, dot) || checkWinInDirection(1, SIDE, dot)
                || checkWinInDirection(2, DOWN, dot) || checkWinInDirection(2, SIDE, dot);
    }

    static boolean checkWinInDirection(int fixedCoordinate, char direction, char dot) {
        int sumForWin = 0;
        for (int i = 0; i < SIZE; i++) {
            if (direction == DOWN) {
                if (dot == MAP[fixedCoordinate][i]) {
                    sumForWin++;
                }
            }
            if (direction == SIDE) {
                if (dot == MAP[i][fixedCoordinate]) {
                    sumForWin++;
                }
            }
        }
        return sumForWin == SIZE;
    }
}
