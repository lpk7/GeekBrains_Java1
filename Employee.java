package ru.geekbrains.java_one.lesson_d.practice;

public class Employee {
    private static int num = 1;
    private int id;
    private String name;
    private String position;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String name, String position, String telephone, int salary, int age) {
        this.id = num++;
        this.name = name;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public boolean ageMoreThan(int age) {
        return this.age > age;
    }

    @Override
    public String toString() {
        return "Идентификационный порядковый номер: " + id + "\n" +
                "ФИО: " + name + "\n" +
                "Должность: " + position + "\n" +
                "Телефон: " + telephone + "\n" +
                "Зарплата: " + salary + "\n" +
                "Возраст: " + age + "\n";
    }
}