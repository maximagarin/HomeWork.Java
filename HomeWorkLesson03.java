package HomeWorkLesson3;

import javafx.scene.control.TextFormatter;

public class HomeWorkLesson03 {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и
        // 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 0, 1, 0, 0, 1};
        printArr("text", arr);
        change(arr);
        printArr("text2", arr);

        //2. Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr2 = new int[100];
        fillIn(arr2);
        printArr("empty []", arr2);

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArr("task 3", arr3);
        for (int i = 0; i < arr3.length; i++)
            if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
        printArr("after", arr3);

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] arr4 = new int[4][4];
        printArr2("task2", arr4);
        crossFill(arr4);
        printArr2("task3", arr4);

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int[] returnArrayFromMethod = returnArray(3,14);
        printArr("Task 4", returnArrayFromMethod);


    }

    //1
    public static void printArr(String msg, int[] inputArray) {
        System.out.println(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }


    }

    //2
    public static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }

    public static void printArr2(String msg, int[][] inputArray) {
        System.out.println(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++)
                System.out.print(inputArray[i][j] + " ");
        }
        System.out.println();
    }
    public static void crossFill(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i][i] = 1;
            inputArray[i][inputArray.length - 1 - i] = i;

        }
        System.out.println();

    }
    public static int[] returnArray(int len, int initValue) {
        int[] tmpArray = new int[len];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = initValue;
        }
        return tmpArray;
    }
}
















