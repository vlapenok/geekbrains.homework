package ru.geekbrains.java2.lesson1;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean letIsTry(int maxJump) {
        return maxJump > height;
    }
}
