package ru.geekbrains.java2.lesson2;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
в какой именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
 */

public class MainApp {
    public static void main(String[] args) {
        try {
            checkArr(new String[][]{
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "З", "4"},
                    {"1", "2", "3", "4"}
            });
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkArr(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4) {
                throw new MyArraySizeException("Исключение: Размер массива должен быть 4х4");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].matches("[-+]?\\d+")) {
                    sum += Integer.parseInt(arr[i][j]);
                } else {
                    throw new MyArrayDataException("Исключение: не правильный формат данных в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        System.out.println(sum);
    }
}
