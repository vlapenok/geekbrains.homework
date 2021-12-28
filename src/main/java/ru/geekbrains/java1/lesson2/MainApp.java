package ru.geekbrains.java1.lesson2;

/*
    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    2. Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
    считаем положительным числом.

    3. Написать метод, которому в качестве параметра передается целое число. Метод должен
    вернуть true, если число отрицательное, и вернуть false если положительное.

    4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
    отпечатать в консоль указанную строку, указанное количество раз.

    5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
    (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
    100-го, при этом каждый 400-й – високосный.
 */

public class MainApp {
    public static void main(String[] args) {
        System.out.println(task1(5, 7));
        task2(-5);
        System.out.println(task3(5));
        task4("Java", 7);
        System.out.println("Год високосный? " + leapYear(2020));
    }

    public static boolean task1(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    public static void task2(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    public static boolean task3(int a) {
        return !(a >= 0);
    }

    public static void task4(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
