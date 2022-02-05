package ru.geekbrains.java1.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (food > appetite) {
            food -= appetite;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("Добавили " + amount + " еды в тарелку");
    }

    public void info() {
        System.out.println("Food: " + food);
    }
}
