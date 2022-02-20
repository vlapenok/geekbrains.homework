package ru.geekbrains.java2.lesson1;

public class Road implements Obstacle {
    private int length;

    public Road(int length) {
        this.length = length;
    }

    @Override
    public boolean letIsTry(int maxRun) {
        return maxRun > length;
    }
}
