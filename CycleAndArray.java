package ru.geekbrains.java_one.lesson_b.practice;

import java.util.Arrays;

public class CycleAndArray {
    public static void main(String[] args) {
        int[] arr2 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(changeOneToZero(arr2)));

        int[] arr3;
        arr3 = new int[8];
        System.out.println(Arrays.toString(fillArray(arr3)));

        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(lessThenSix(arr4)));

        int[] arr5 = {3, 9, 5, -10, 0, 16, 4, -222};
        System.out.println(searchMin(arr5));
        System.out.println(searchMax(arr5));

        int[][] arr6 = new int[6][6];
        diagonalsArray(arr6);
        for (int i = 0; i < arr6.length; i++) {
            System.out.println(Arrays.toString(arr6[i]));
        }

        System.out.println(equalLeftAndRight(arr2));

        System.out.println(Arrays.toString(transferToN(arr5, -2)));

        System.out.println(Arrays.toString(transferToNn(arr5, -2)));

    }

    public static int[] changeOneToZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        return arr;
    }

    public static int[] fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3 + 1;
        }
        return arr;
    }

    public static int[] lessThenSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static int searchMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int searchMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void diagonalsArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
            }
        }
    }

    public static boolean equalLeftAndRight(int[] arr) {
        int summ = 0;
        int summleft = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        if (summ % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                summleft += arr[i];
                if (summleft > summ / 2) {
                    break;
                }
                if (summleft == summ / 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] transferToN(int[] arr, int n) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (0 < i + n && i + n < arr.length || i + n == 0) {
                temp[i + n] = arr[i];
            } else if (n >= 0) {
                temp[(i + n) % arr.length] = arr[i];
            } else {
                temp[arr.length + n + i] = arr[i];
            }
        }
        return temp;
    }
}
