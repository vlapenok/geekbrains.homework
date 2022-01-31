package ru.geekbrains.java1.lesson6;

import ru.geekbrains.java1.lesson6.animals.Animal;
import ru.geekbrains.java1.lesson6.animals.Cat;
import ru.geekbrains.java1.lesson6.animals.Dog;

public class MainApp {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Барсик", 250, 0),
                new Cat("Мурзик", 350, 0),
                new Cat("Матроскин", 150, 10),
                new Dog("Шарик", 500, 5),
                new Dog("Тузик", 400, 15),
        };

        int countAnimals = 0;

        for (Animal a : animals) {
            a.run(300);
            a.swim(10);
            System.out.println();
            countAnimals = a.getCount();
        }

        System.out.println("Всего животных: " + countAnimals);
    }
}
