package ru.geekbrains.java2.lesson1.team;

public class Cross implements Course {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(length);
    }
}
