package ru.geekbrains.java2.lesson1;

public class Robot implements Athlete {
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean isReady;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        isReady = true;
    }

    @Override
    public boolean isReady() {
        return isReady;
    }

    @Override
    public void letIsTry(Obstacle obstacle) {
        if(obstacle instanceof Wall) {
            if(obstacle.letIsTry(maxJump)) {
                System.out.println(name + " преодолел стену");
            } else {
                System.out.println(name + " не смог преодолеть");
                isReady = false;
            }
        }
        if(obstacle instanceof Road) {
            if(obstacle.letIsTry(maxRun)) {
                System.out.println(name + " пробежал дистанцию");
            } else {
                System.out.println(name + " не смог пробежать");
                isReady = false;
            }
        }
    }
}
