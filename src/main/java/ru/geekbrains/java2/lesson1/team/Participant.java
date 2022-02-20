package ru.geekbrains.java2.lesson1.team;

public interface Participant {
    String getName();

    void run(int distance);

    void jump(int distance);

    void info();

    boolean isFinish();
}
