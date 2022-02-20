package ru.geekbrains.java2.lesson1.team;

public class Human implements Participant {
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean isFinish;

    Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        isFinish = true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFinish() {
        return isFinish;
    }

    @Override
    public void run(int distance) {
        if (!isFinish) {
            System.out.println(name + " сошел с дистанции и продолжать соревнования не может");
        }
        if (maxRun > distance) {
            System.out.println(name + " проходит дистанцию");
        } else {
            System.out.println(name + " не может пройти дистанцию");
            isFinish = false;
        }
    }

    @Override
    public void jump(int distance) {
        if (!isFinish) {
            System.out.println(name + " сошел с дистанции и продолжать соревнования не может");
        }
        if (maxJump > distance) {
            System.out.println(name + " перепрыгивает стену");
        } else {
            System.out.println(name + " не может перепрыгнуть");
            isFinish = false;
        }
    }

    @Override
    public void info() {
        System.out.println(name + " бежит на " + maxRun + " и прыгает на " + maxJump);
    }
}
