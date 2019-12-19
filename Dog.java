package ru.geekbrains.java_one.lesson_e.practice;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
        super.jumpHeight = random(0.5);
        super.runDistance = random(500);
        super.swimDistance = random(10);
    }

    @Override
    public void jump(double j) {
        if(j <= jumpHeight) {
            System.out.println("Пёсик " + name + " перепрыгнул " + j + " м!");
        } else {
            System.out.println("Пёсик " + name + " не перепрыгнул " + j + " м!");
        }
    }

    @Override
    public void swim(double s) {
        if(s <= swimDistance) {
            System.out.println("Пёсик " + name + " проплыл " + s + " м!");
        } else {
            System.out.println("Пёсик " + name + " не проплыл " + s + " м!");
        }
    }

    @Override
    public void run(double r) {
        if (r <= runDistance) {
            System.out.println("Пёсик " + name + " пробежал " + r + " м!");
        } else {
            System.out.println("Пёсик " + name + " не пробежал " + r + " м!");
        }
    }
}
