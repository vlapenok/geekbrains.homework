package ru.geekbrains.java1.lesson6.animals;

public class Dog extends Animal {

    public Dog(String name, int max_run, int max_swim) {
        super(name, max_run, max_swim);
        this.type = "Собака";
        this.max_swim = max_swim;
    }
}
