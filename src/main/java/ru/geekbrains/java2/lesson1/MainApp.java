package ru.geekbrains.java2.lesson1;

public class MainApp {
    public static void main(String[] args) {
        Athlete[] athletes = {
                new Human("Вадим", 150, 1),
                new Cat("Барсик", 80, 3),
                new Robot("Андройд", 1000, 10)
        };
        Obstacle[] obstacles = {
                new Wall(2),
                new Road(100)
        };

        for (Athlete a : athletes) {
            for (Obstacle o : obstacles) {
                if (a.isReady()) {
                    a.letIsTry(o);
                }
            }
            System.out.println();
        }
    }
}
