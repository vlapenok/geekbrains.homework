package ru.geekbrains.java1.lesson7;

public class ToyBox {
    private boolean isOpened;
    private Toy toy;

    public void putToy(Toy newToy) {
        if(!isOpened) {
            System.out.println("Чтобы положить игрушку нужно сначала открыть коробку");
            return;
        }
        if(toy != null) {
            System.out.println("В коробке уже лежит " + toy.getName());
            return;
        }
        toy = newToy;
    }

    public void extractToy() {
        if(!isOpened) {
            System.out.println("Чтобы достать игрушку, нужно сначала открыть коробку");
            return;
        }
        if(toy == null) {
            System.out.println("В коробке пусто");
            return;
        }
        System.out.println("Из коробки достали игрушку " + toy.getName());
        toy = null;
    }

    public void open() {
        if(isOpened) {
            System.out.println("Коробка уже открыта");
            return;
        }
        System.out.println("Открыли коробку");
        isOpened = true;
    }

    public void close() {
        if(!isOpened) {
            System.out.println("Коробка уже закрыта");
            return;
        }
        System.out.println("Закрыли коробку");
        isOpened = false;
    }

    public void info() {
        System.out.printf("Коробка %s и в ней " + (toy == null ? "ничего нет\n" : "лежит " + toy.getName() + "\n"),
                (isOpened ? "открыта" : "закрыта"));
    }
}
