package ru.geekbrains.java1.lesson6.animals;

public class Cat extends Animal {

    public Cat(String name, int max_run, int max_swim) {
        super(name, max_run, max_swim);
        this.max_swim = 0;
        this.type = "Кот";
    }
}
