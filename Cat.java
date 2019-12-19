package ru.geekbrains.java_one.lesson_e.practice;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        super.jumpHeight = random(2);
        super.runDistance = random(200);
        super.swimDistance = random(0);
    }

    @Override
    public void jump(double j) {
        if(j <= jumpHeight) {
            System.out.println("Котик " + name + " перепрыгнул " + j + " м!");
        } else {
            System.out.println("Котик " + name + " не перепрыгнул " + j + " м!");
        }
    }

    @Override
    public void swim(double s) {
        System.out.println("Котик " + name + " не умеет плавать!");

    }

    @Override
    public void run(double r) {
        if (r <= runDistance) {
            System.out.println("Котик " + name + " пробежал " + r + " м!");
        } else {
            System.out.println("Котик " + name + " не пробежал " + r + " м!");
        }
    }
}
