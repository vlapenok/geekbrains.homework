package ru.geekbrains.java1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        hungry = true;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate plate) {
        if (!hungry) {
            System.out.println(name + " не голоден");
            return;
        }
        if(plate.decreaseFood(appetite)) {
            System.out.println(name + " покушал из тарелки");
            hungry = false;
            appetite = 0;
        } else {
            System.out.println(name + " не хватило еды в тарелке");
        }
    }

    public void info() {
//        System.out.printf("Cat " + name + " appetite %d " + " and he is " + (hungry ? "hungry" : "not hungry"), appetite);
        String info = String.format("Cat " + name + " appetite %d " + " and he is " + (hungry ? "hungry" : "not hungry"), appetite);
        String infoCut = info.replaceAll("\\s+", " ");
        System.out.print(infoCut);
        System.out.println();
    }
}
