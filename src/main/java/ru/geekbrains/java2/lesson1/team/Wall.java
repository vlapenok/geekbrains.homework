package ru.geekbrains.java2.lesson1.team;

public class Wall implements Course {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
