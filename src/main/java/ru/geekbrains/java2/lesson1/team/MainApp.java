package ru.geekbrains.java2.lesson1.team;

public class MainApp {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Human", 150, 1),
                new Cat("Barsik", 200, 3),
                new Robot("Android", 1000, 10),
        };

        Course[] course = {
                new Wall(5),
                new Cross(200)
        };

        for (Participant p : participants) {
            for (Course c : course) {
                c.doIt(p);
            }
            System.out.println();
        }

        for (Participant p : participants) {
            p.info();
        }
        System.out.println();

        for (Participant p : participants) {
            if (p.isFinish()) {
                System.out.print("Участники которые прошли все испытания: ");
                System.out.print(p.getName() + " ");
            }
        }
    }
}
