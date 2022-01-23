package ru.geekbrains.java1.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Василий", "Федоров", "мастер-приемщик", "rayman1@rambler.ru", 79043334558L, 60000, 36),
                new Employee("Анатолий", "Ребо", "логист", "arebo@mail.ru", 79211234567L, 100000, 29),
                new Employee("Максим", "Орлов", "допщик", "orlov82@yandex.ru", 79119278287L, 200000, 39),
                new Employee("Алексей", "Третьяков", "допщик", "atretiakov@abg.ru", 79059874563L, 150000, 34),
                new Employee("Дмитрий", "Левчук", "продавец озч", "levchuk@google.com", 79114561238L, 180000, 45),
        };

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40) {
                employees[i].getInfo();
            }
        }
    }
}
