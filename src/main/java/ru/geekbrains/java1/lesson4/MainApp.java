package ru.geekbrains.java1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    private static Scanner scanner;
    private static Random random;
    private static char[][] map;

    private static final int SIZE_X = 5;
    private static final int SIZE_Y = 5;

    private static final char EMPTY = '_';
    private static final char PLAYER = 'X';
    private static final char AI = 'O';
    private static final int WIN_LENGTH = 4; //Длина выигрышной комбинации

    public static void main(String[] args) {
        initialize(); //Заполнение игрового поля значениями по-умолчанию
        printMap(); //Распечатка игрового поля
        while (true) {
            playerTurn(); //Ход игрока
            printMap();
            if (checkWin(PLAYER)) {
                System.out.println("Игра окончена, победил Игрок!");
                break;
            }
            if (isMapFull()) { //Проверка на свободную ячейку после хода игрока
                System.out.println("Игра окончена, ничья!");
                break;
            }
            aiTurn(); //Ход компьютера
            printMap();
            if (checkWin(AI)) {
                System.out.println("Игра окончена, победил Компьютер!");
                break;
            }
            if (isMapFull()) { //Проверка на свободную ячейку после хода компьютера
                System.out.println("Игра окончена, ничья!");
                break;
            }
        }
    }

    public static boolean checkWin(char element) {
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                if (checkLine(i, j, 1, 0, element)) { //Проверка горизонтали
                    return true;
                }
                if (checkLine(i, j, 0, 1, element)) { //Проверка вертикали
                    return true;
                }
                if (checkLine(i, j, 1, 1, element)) { //Проверка диагонали
                    return true;
                }
                if (checkLine(i, j, 1, -1, element)) { //Проверка обратной диагонали
                    return true;
                }
            }
        }

//        for (int i = 0; i < SIZE_X; i++) {
//            //Проверка вертикалей
//            int count = 0;
//            for (int j = 0; j < SIZE_Y; j++) {
//                if (map[i][j] == element) {
//                    count++;
//                } else {
//                    count = 0;
//                }
//                if (count == WIN_LENGTH) {
//                    return true;
//                }
//            }
//
//            //Проверка горизонталей
//            count = 0;
//            for (int j = 0; j < SIZE_Y; j++) {
//                if (map[j][i] == element) {
//                    count++;
//                } else {
//                    count = 0;
//                }
//                if (count == WIN_LENGTH) {
//                    return true;
//                }
//            }
//
//            //Проверка левой диагонали
//            count = 0;
//            for (int j = 0; j < SIZE_Y; j++) {
//                if (map[j][j] == element) {
//                    count++;
//                } else {
//                    count = 0;
//                }
//                if (count == WIN_LENGTH) {
//                    return true;
//                }
//            }
//
//            //Проверка правой диагонали
//            count = 0;
//            for (int j = 0; j < SIZE_Y; j++) {
//                if (map[map.length - 1 - j][j] == element) {
//                    count++;
//                } else {
//                    count = 0;
//                }
//                if (count == WIN_LENGTH) {
//                    return true;
//                }
//            }
//        }
        return false;

//        //Проверка горизонталей
//        if(map[0][0] == element && map[1][0] == element && map[2][0] == element) {
//            return true;
//        }
//        if(map[0][1] == element && map[1][1] == element && map[2][1] == element) {
//            return true;
//        }
//        if(map[0][2] == element && map[1][2] == element && map[2][2] == element) {
//            return true;
//        }
//
//        //Проверка вертикалей
//        if(map[0][0] == element && map[0][1] == element && map[0][2] == element) {
//            return true;
//        }
//        if(map[1][0] == element && map[1][1] == element && map[1][2] == element) {
//            return true;
//        }
//        if(map[2][0] == element && map[2][1] == element && map[2][2] == element) {
//            return true;
//        }
//
//        //Проверка диагоналей
//        if(map[0][0] == element && map[1][1] == element && map[2][2] == element) {
//            return true;
//        }
//        if(map[2][0] == element && map[1][1] == element && map[0][2] == element) {
//            return true;
//        }

    }

    //Метод проверки выигрышной линии
    public static boolean checkLine(int startX, int startY, int vX, int vY, char element) {
        if (/* startX + (WIN_LENGTH - 1) * vX < 0 || */ startY + (WIN_LENGTH - 1) * vY < 0
                || startX + (WIN_LENGTH - 1) * vX >= SIZE_X || startY + (WIN_LENGTH - 1) * vY >= SIZE_Y) {
            return false;
        }
        for (int i = 0; i < WIN_LENGTH; i++) {
            if (map[startX + i * vX][startY + i * vY] != element) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                if (map[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initialize() {
        map = new char[SIZE_X][SIZE_Y];
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("    ");
        for (int i = 1; i <= map.length; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(" " + map[j][i] + " |");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void playerTurn() {
        scanner = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Введите координаты хода игрока ('X' 'Y')");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[x][y] = PLAYER;
    }

    public static void aiTurn() {
//Блок блокировки выигрышной линии противника
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                char temp = map[i][j];
                if (temp == EMPTY) {
                    map[i][j] = PLAYER;
                    if (checkWin(PLAYER)) {
                        map[i][j] = AI;
                        System.out.println("Компьютер заблокировал вашу линию на [ " + (i + 1) + ", " + (j + 1) + " ]");
                        return;
                    } else {
                        map[i][j] = temp;
                    }
                }
            }
        }
//Конец блока
//Блок случаного хода ai
        random = new Random();
        int x, y;
        do {
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellEmpty(x, y));
        map[x][y] = AI;
        System.out.println("Компьютер сделал ход на [ " + (x + 1) + ", " + (y + 1) + " ]");
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x > SIZE_X - 1 || y > SIZE_Y - 1 || x < 0 || y < 0) {
            System.out.println("Вы ввели неправильные координаты");
            return false;
        }
        if (map[x][y] != EMPTY) {
//            System.out.println("Эта клетка уже занята");
            return false;
        }
        return true;
    }
}
