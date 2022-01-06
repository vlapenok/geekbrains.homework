package ru.geekbrains.java1.lesson3;

public class MainApp {

    public static void shifter(int[] arr, int value) {
        printArray(arr);
        boolean flag;
        if(value > 0) {
            flag = true;
        } else {
            value = -value;
            flag = false;
        }
        int temp;
        for (int i = 0; i < value; i++) {
            if(flag) {
                temp = arr[arr.length - 1];
            } else {
                temp = arr[0];
            }
            for (int j = 0; j < arr.length - 1; j++) {
                if(flag) {
                    arr[arr.length - 1 - j] = arr[arr.length - 1 - j - 1];
                } else {
                    arr[j] = arr[j + 1];
                }
            }
            if(flag) {
                arr[0] = temp;
            } else {
                arr[arr.length - 1] = temp;
            }
        }
        System.out.println();
        printArray(arr);
    }

    public static boolean checkBalance(int[] arr) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            left += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                right += arr[j];
            }
            System.out.println(left + " " + right);
            if(left == right) {
                return true;
            }
            right = 0;
        }
        return false;
    }

    public static void minMax() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 14, -5, 2, 4, 8, 9, 1};
        int min = arr[0], max = arr[0];
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max = " + max + "\n" + "min = " + min + "\n" + "avg = " + Math.floor(avg/arr.length * 100)/100);
    }

    public static int[] task5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        printArray(arr);
        return arr;
    }

    public static void fillDiagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
                arr[i][i] = 1;
                arr[i][j] = 1;
        }
        printArray(arr);
    }

    public static void lessSix() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        printArray(arr);
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        printArray(arr);
    }

    public static void change() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        change(); //Поменять цифры местами, вместо 1 поставить 0 и наоборот.
//        fillArray(); //Заполнить пустой массив числами от 1 до 100
//        lessSix(); //Цифры меньше 6 умножить на 2
//        fillDiagonal(); //Заполнить диагонали квадратного двумерного массива единицами
//        task5(10, 8); //Создать массив длинной len и заполнить его initialValue
//        minMax(); //Найти минимальное и максимальное значение в массиве
//        System.out.println(checkBalance(new int[]{1, 5, 3, 2, 11, 14, -5, 2, 4, 8, 9, 2})); //Проверка на середину
        shifter(new int[]{1, 5, 3, 2, 11, 14, -5, 2, 4, 8, 9, 2}, -3); //Смещение значений в массиве на "value"
    }
}
