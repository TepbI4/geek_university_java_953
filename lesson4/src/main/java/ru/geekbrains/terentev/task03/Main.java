package ru.geekbrains.terentev.task03;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int SIZE = 5;
    private static final int SIZE_TO_WIN = 4;

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

//            if (checkMapIsFull()) {
//                System.out.println("Draw!");
//            }
//
//            aiTurn();
//            if (checkWin(AI_DOT)) {
//                System.out.println("AI won!");
//                break;
//            }
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
        for (int i = 0; i <= (SIZE - SIZE_TO_WIN); i++) {
            for (int j = 0; j <= (SIZE - SIZE_TO_WIN); j++) {
                if (checkWinMinor(dot, i, j)) return true;
            }
        }
        return false;
    }

    static boolean checkWinMinor(char dot, int deltaX, int deltaY) {
        int mainDiag = 0;
        int secondaryDiag = 0;

        for (int i = 0; i < SIZE_TO_WIN; i++) {
            if (MAP[i + deltaX][i + deltaY] == dot) {
                mainDiag++;
            }

            if (MAP[i + deltaX][(SIZE_TO_WIN - 1) - i + deltaY] == dot) {
                secondaryDiag++;
            }

            if (checkWinInDirection(i, DOWN, dot, deltaX, deltaY) || checkWinInDirection(i, SIDE, dot, deltaX, deltaY)) return true;
        }

        return mainDiag == SIZE_TO_WIN || secondaryDiag == SIZE_TO_WIN;
    }

    static boolean checkWinInDirection(int fixedCoordinate, char direction, char dot, int deltaX, int deltaY) {
        int sumForWin = 0;
        for (int i = 0; i < SIZE_TO_WIN; i++) {
            if (direction == DOWN) {
                if (dot == MAP[fixedCoordinate+deltaX][i+deltaY]) {
                    sumForWin++;
                }
            }
            if (direction == SIDE) {
                if (dot == MAP[i+deltaX][fixedCoordinate+deltaX]) {
                    sumForWin++;
                }
            }
        }
        return sumForWin == SIZE_TO_WIN;
    }
}
