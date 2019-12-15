package ru.geekbrains.java_one.lesson_d.practice;

import java.util.Arrays;

public class Objects {
    public static void main(String[] args){

        Employee e1 = new Employee("Петров Семен Петрович", "Директор", "88123124455",
                65000, 42);
        Employee e2 = new Employee("Макаров Илья Дмитриевич", "Бухгалтер", "88123124456",
                60000, 67);
        Employee e3 = new Employee("Сергеева Наталья Эдуардовна", "Начальник отдела продаж",
                "88123124467", 60000, 36);
        Employee e4 = new Employee("Звягинцев Андрей Петрович", "Старший кладовщик",
                "88123124445", 45000, 40);
        Employee e5 = new Employee("Нурутдинов Ильшат Нурутдинович",
                "Грузчик, грузчик - парень работящий", "89633005675", 30000, 22);

        System.out.println(String.format("ФИО: %s\nДолжность: %s", e3.getName(), e3.getPosition()));

        Employee[] arr = {e1, e2, e3, e4, e5};

        System.out.println("Сотрудники старше 40 лет:");
        System.out.println(printEmployeeOlderThan(arr, 40));

        increaseSalary(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static String printEmployeeOlderThan(Employee[] arr, int age) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].ageMoreThan(age)) {
                result += arr[i];
            }
        }
        return result;
    }

    public static void increaseSalary(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].ageMoreThan(45)) {
                arr[i].setSalary(arr[i].getSalary() + 5000);
            }
        }
    }
}
