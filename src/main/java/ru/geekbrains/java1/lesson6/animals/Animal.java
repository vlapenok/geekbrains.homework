package ru.geekbrains.java1.lesson6.animals;

public abstract class Animal {
    String type;
    String name;
    int max_run;
    int max_swim;
    private static int count; //Подсчёт количества животных

    public Animal(String name, int max_run, int max_swim) {
        this.name = name;
        this.max_run = max_run;
        count++;
    }

    public int getCount() {
        return count;
    }

    public void run(int value) {
        if(max_run >= value) {
            System.out.println(type + " " + name + " бежит на " + value + " метров");
        } else {
            System.out.println(type + " " + name + " не может пробежать " + value + " метров");
        }
    };

    public void swim(int value) {
        if(max_swim == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            return;
        }
        if(max_swim >= value) {
            System.out.println(type + " " + name + " плывет на " + value + " метров");
        } else {
            System.out.println(type + " " + name + " не умеет плвавать");
        }
    };
}
