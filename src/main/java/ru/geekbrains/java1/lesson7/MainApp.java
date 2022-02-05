package ru.geekbrains.java1.lesson7;

public class MainApp {
    public static void main(String[] args) {
        cats();
//        toyBox();
    }

    public static void cats() {
        Plate plate = new Plate(50);
        Cat[] cats = {
                new Cat("Barsik", 8),
                new Cat("Shustrik", 18),
                new Cat("Matroskin", 32),
                new Cat("Basilio", 15)
        };

        for (Cat cat : cats) {
            while (cat.isHungry()) {
                cat.eat(plate);
                if (cat.isHungry()) {
                    plate.addFood(2);
                }
            }
            cat.info();
            plate.info();
            System.out.println();
        }
    }

    public static void toyBox() {
        ToyBox toyBox = new ToyBox();
        Toy toy1 = new Toy("Teddy Bear");
        Toy toy2 = new Toy("TinyCar");
        Toy toy3 = new Toy("Ball");

        toyBox.info();
        toyBox.putToy(toy1);
        toyBox.open();
        toyBox.open();
        toyBox.info();
        toyBox.putToy(toy1);
        toyBox.info();
        toyBox.putToy(toy2);
        toyBox.info();
        toyBox.close();
        toyBox.info();
        toyBox.putToy(toy3);
        toyBox.info();
        toyBox.open();
        toyBox.info();
        toyBox.extractToy();
        toyBox.extractToy();
        toyBox.info();
        toyBox.putToy(toy3);
        toyBox.info();
    }
}
