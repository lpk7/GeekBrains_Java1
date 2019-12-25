package ru.geekbrains.java_one.lesson_c.practice;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

        private static final char DOT_HUMAN = 'X';
        private static final char DOT_AI = 'O';
        private static final char DOT_EMPTY = '.';
        private static final Scanner SCANNER = new Scanner(System.in);
        private static final Random RANDOM = new Random();
        private static char[][] field;
        private static int DOTS_TO_WIN = 3;
        private static int fieldSizeX;
        private static int fieldSizeY;

        private static void initField(int sizeY, int sizeX) {
            fieldSizeY = sizeY;
            fieldSizeX = sizeX;
            field = new char[fieldSizeY][fieldSizeX];
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    field[y][x] = DOT_EMPTY;
                }
            }
        }

        private static void printField() {
            System.out.print("+");
            for (int i = 0; i < fieldSizeX * 2 + 1; i++)
                System.out.print((i % 2 == 0) ? "-" : i / 2 + 1);
            System.out.println();

            for (int i = 0; i < fieldSizeX; i++) {
                System.out.print(i + 1 + "|");
                for (int j = 0; j < fieldSizeX; j++)
                    System.out.print(field[i][j] + "|");
                System.out.println();
            }

            for (int i = 0; i < fieldSizeX * 2 + 1; i++)
                System.out.print("-");
            System.out.println();
        }

        private static void humanTurn() {
            int x;
            int y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = SCANNER.nextInt() - 1;
                y = SCANNER.nextInt() - 1;
            } while (!isValidCell(x, y) || !isEmptyCell(x, y));
            field[y][x] = DOT_HUMAN;
        }

        private static boolean isValidCell(int x, int y) {
            return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
        }

        private static boolean isEmptyCell(int x, int y) {
            return field[y][x] == DOT_EMPTY;
        }

        private static void aiTurn() {
            int x;
            int y;
            do {
                x = RANDOM.nextInt(fieldSizeX);
                y = RANDOM.nextInt(fieldSizeY);
            } while (!isEmptyCell(x, y));
            field[y][x] = DOT_AI;
        }

        private static boolean checkWin(char c) {boolean horizontal_result, vertical_result, diagonal_result_1, diagonal_result_2;
        horizontal_result = vertical_result = diagonal_result_1 = diagonal_result_2 = false;
        byte count;

        for (int i = 0; i < fieldSizeX; i++) {
            horizontal_result = false;
            count = 0;
            for (int j = 0; j < fieldSizeX; j++) {
                if(field[i][j] == c)
                    count++;
                else if (count < DOTS_TO_WIN)
                    count = 0;
            }
            if (count == DOTS_TO_WIN) {
                horizontal_result = true;
                break;
            }
        }

        for (int i = 0; i < fieldSizeX; i++) {
            vertical_result = false;
            count = 0;
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[j][i] == c)
                    count++;
                else if (count < DOTS_TO_WIN)
                    count = 0;
            }
            if (count == DOTS_TO_WIN) {
                vertical_result = true;
                break;
            }
        }
        count = 0;
        for (int i = 0; i <= fieldSizeX - DOTS_TO_WIN; i++) {
            count = 0;
            for (int j = 0; j + i < fieldSizeX; j++) {
                if (field[j][i + j] == c)
                    count++;
                else if (count < DOTS_TO_WIN) {
                    count = 0;
                }
                if (count == DOTS_TO_WIN) {
                    diagonal_result_1 = true;
                    break;
                }
            }
            count = 0;
            if (!diagonal_result_1) {
                for (int k = 0; k + i < fieldSizeX && i > 0; k++) {
                    if (field[i + k][k] == c)
                        count++;
                    else if (count < DOTS_TO_WIN) {
                        count = 0;
                    }
                    if (count == DOTS_TO_WIN) {
                        diagonal_result_1 = true;
                        break;
                    }
                }
            }
        }
            count = 0;
            for (int i = 0; i <= fieldSizeX - DOTS_TO_WIN; i++) {
                count = 0;
                for (int j = 0; j + i < fieldSizeX; j++) {
                    if (field[j][fieldSizeX - 1 - (i + j)] == c)
                        count++;
                    else if (count < DOTS_TO_WIN) {
                        count = 0;
                    }
                    if (count == DOTS_TO_WIN) {
                        diagonal_result_2 = true;
                        break;
                    }
                }
            count = 0;
            if (!diagonal_result_2) {
                for (int k = 0; k + i < fieldSizeX && i > 0; k++) {
                    if (field[i + k][fieldSizeX - 1 - k] == c)
                        count++;
                    else if (count < DOTS_TO_WIN) {
                        count = 0;
                    }
                    if (count == DOTS_TO_WIN) {
                        diagonal_result_2 = true;
                        break;
                    }
                }
            }
        }
        return horizontal_result || vertical_result || diagonal_result_1 || diagonal_result_2;
    }

        private static boolean isDraw() {
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    if (field[y][x] == DOT_EMPTY)
                        return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            initField(3, 3);
            printField();
            while (true) {
                humanTurn();
                printField();
                if (checkWin(DOT_HUMAN)) {
                    System.out.println("Human win!");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Draw!");
                    break;
                }
                aiTurn();
                printField();
                if (checkWin(DOT_AI)) {
                    System.out.println("Computer win!");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Draw!");
                    break;
                }
            }
        }
}
