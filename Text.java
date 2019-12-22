package ru.geekbrains.java_one.lesson_f.practice;

import java.io.*;
import java.util.Scanner;

public class Text {
    public static void main (String[] args) {

        try {
            FileOutputStream fileOne = new FileOutputStream("src/ru/geekbrains/java_one/lesson_f/practice/file1.txt");
            FileOutputStream fileTwo = new FileOutputStream("src/ru/geekbrains/java_one/lesson_f/practice/file2.txt");
            PrintStream creatorOne = new PrintStream(fileOne);
            PrintStream creatorTwo = new PrintStream(fileTwo);
            creatorOne.print("Long ago, in a time forgotten, a preternatural event threw the seasons out of balance.");
            creatorTwo.print("In a land where summers can last decades and winters a lifetime, trouble is brewing.");
            FileInputStream fisOne = new FileInputStream("src/ru/geekbrains/java_one/lesson_f/practice/file1.txt");
            FileInputStream fisTwo = new FileInputStream("src/ru/geekbrains/java_one/lesson_f/practice/file2.txt");
            FileWriter fw = new FileWriter("src/ru/geekbrains/java_one/lesson_f/practice/file3.txt");

            Scanner scOne = new Scanner(fisOne);
            while (scOne.hasNext()) {
               fw.write(scOne.nextLine());
            }
                fw.write('\n');
            Scanner scTwo = new Scanner(fisTwo);
            while (scTwo.hasNext()) {
                fw.write(scTwo.nextLine());
            }
            fisOne.close();
            fisTwo.close();
            fileOne.close();
            fileTwo.close();
            fw.close();
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
