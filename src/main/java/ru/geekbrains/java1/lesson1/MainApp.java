package ru.geekbrains.java1.lesson1;

/*
    1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.

    2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте
    их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма
    больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”.

    3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
    от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”.

    4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”.
*/

public class MainApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -5;
        int b = 10;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 101;
        System.out.println(value <= 0 ? "Красный" : value > 0 && value <= 100 ? "Желтый" : "Зеленый");
    }

    public static void compareNumbers() {
        int a = -5;
        int b = 10;
        System.out.println(a >= b ? "a>=b" : "a<b");
    }
}
