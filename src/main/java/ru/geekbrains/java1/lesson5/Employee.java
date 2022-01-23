package ru.geekbrains.java1.lesson5;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public Employee(String name, String surname, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("Сотрудник: " + name + " " + surname);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
    }
}
