package ru.geekbrains.java_one.lesson_e.practice;

public class Horse extends Animal {

    public Horse(String name) {
        super(name);
        super.jumpHeight = random(3);
        super.runDistance = random(1500);
        super.swimDistance = random(100);
    }

    @Override
    public void jump(double j) {
        if(j <= jumpHeight) {
            System.out.println("Лошадка " + name + " перепрыгнула " + j + " м!");
        } else {
            System.out.println("Лошадка " + name + " не перепрыгнула " + j + " м!");
        }
    }

    @Override
    public void swim(double s) {
        if(s <= swimDistance) {
            System.out.println("Лошадка " + name + " проплыла " + s + " м!");
        } else {
            System.out.println("Лошадка " + name + " не проплыла " + s + " м!");
        }
    }

    @Override
    public void run(double r) {
        if(r <= runDistance) {
            System.out.println("Лошадка " + name + " пробежала " + r + " м!");
        } else {
            System.out.println("Лошадка " + name + " не пробежала " + r + " м!");
        }
    }
}
