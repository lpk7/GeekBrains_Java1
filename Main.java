package ru.geekbrains.java_one.lesson_e.practice;

public class Main {

    public static void main (String[] args) {

        Animal horse1 = new Horse("Даша");
        Animal horse2 = new Horse("Анжела");
        Animal dog1 = new Dog("Бобик");
        Animal dog2 = new Dog("Шарик");
        Animal cat1 = new Cat("Василий");
        Animal cat2 = new Cat("Алиса");
        Animal bird1 = new Bird("Кеша");
        Animal bird2 = new Bird("Шуша");

        Animal[] zoo = {horse1, horse2, dog1, dog2, cat1, cat2, bird1, bird2};

        for (int i = 0; i < zoo.length; i++) {
            System.out.println(zoo[i].toString());
            zoo[i].jump(0.9);
            zoo[i].swim(30);
            zoo[i].run(50);
        }
    }
}
