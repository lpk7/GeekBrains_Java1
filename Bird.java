package ru.geekbrains.java_one.lesson_e.practice;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
        super.jumpHeight = random(0.2);
        super.runDistance = random(5);
        super.swimDistance = random(0);
    }

    @Override
    public void jump(double j) {
        if(j <= jumpHeight) {
            System.out.println("Птичка " + name + " перепрыгнула " + j + " м!");
        } else {
            System.out.println("Птичка " + name + " не перепрыгнула " + j + " м!");
        }
    }

    @Override
    public void swim(double s) {
        System.out.println("Птичка " + name + " не умеет плавать!");
    }

    @Override
    public void run(double r) {
        if(r <= runDistance) {
            System.out.println("Птичка " + name + " пробежала " + r + " м!");
        } else {
            System.out.println("Птичка " + name + " не пробежала " + r + " м!");
        }
    }
}
