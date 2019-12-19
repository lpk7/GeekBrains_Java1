package ru.geekbrains.java_one.lesson_e.practice;

public abstract class Animal {
    String name;
    double jumpHeight;
    double runDistance;
    double swimDistance;

    public Animal(String name) {
        this.name = name;
    }

    public double random(double f) {
        double min = f - 0.2 * f;
        double max = f + 0.2 * f;
        return min + Math.random() * (max - min);
    }

    @Override
    public String toString() {
        return "Имя " + name + '\n' +
                "Высота прыжка " + jumpHeight + '\n' +
                "Дистанция бега " + runDistance + '\n' +
                "Дистанция заплыва " + swimDistance;
    }

    public abstract void jump (double j);

    public abstract void swim (double s);

    public abstract void run (double r);
}
