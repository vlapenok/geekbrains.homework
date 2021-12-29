package ru.geekbrains.java1.lesson2;

public class TestApp {

    public static int n = 6;

    public static void schema1() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void schema2() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void schema3() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == j || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void schema4() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i > 1 && i < 4 && j > 1 && j < 4) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void schema5() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i < 2 && j > 3 || i > 3 && j < 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void rectangleInRectangle() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void triangleWithSpace() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    System.out.print(" ");
                } else if(i > j) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void chess() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0 && i % 2 == 0 || j % 2 == 1 && i % 2 == 1) { // (i + j) % 2 == 0
                    System.out.print("* ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        chess(); //Шахматный порядок
//        triangle(); //Треугольники
//        triangleWithSpace(); //Треугольники с разделением по диагонали
//        rectangleInRectangle();
//        schema1(); //Звезды только по периметру
//        schema2(); //Звезды по периметру и по диагонали
//        schema3(); //Треугольник из звезд по периметру
//        schema4(); //Квадрат из звезд с пустым центром
        schema5();
    }
}
