package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class ArrayTasks {
    public static void main(String[] args) {
        // task1();
        // task2();
        //task3();
        //task6();
        //task6Variant2();
        //task8();
        //task9();
        //task10();
        //task19();
        task20();
    }

    //1. Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице.
    public static void task1() {
        int[] array = new int[7];
        array[0] = 1;
        array[6] = 1;
        System.out.println(Arrays.toString(array));
    }

    //2. Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.
    public static void task2() {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //3. Заполнить массив последовательными нечетными числами, начиная с единицы.
    public static void task3() {
        int[] array = new int[7];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 2;
        }
        System.out.println(Arrays.toString(array));
    }

    //6. Сформировать убывающий массив из чисел, которые делятся на 3.
    public static void task6() {
        int[] array = new int[7];
        array[array.length - 1] = 3;
        for (int i = array.length - 2; i >= 0; i--) {
            array[i] = array[i + 1] + 3;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task6Variant2() {
        int[] array = new int[7];
        int value = array.length * 3;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value -= 3;
        }
        System.out.println(Arrays.toString(array));
    }

    //8. Заполнить массив заданной длины различными простыми числами.
    public static void task8() {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
    }

    //9. Создать массив, каждый элемент которого равен квадрату своего номера.
    public static void task9() {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(i, 2);
        }
        System.out.println(Arrays.toString(array));
    }

    //10. Создать массив, на четных местах в котором стоят единицы, а на нечетных местах - числа,
    // равные остатку от деления своего номера на 5.
    public static void task10() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = i % 5;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //19. Определить, содержит ли массив данное число x
    public static void task19() {
        int x = 8;
        int[] array = new int[]{1, 7, 6, 8, 0, 5, 4};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 8) {
                System.out.println("В массиве есть число 8");
                return;
            }
        }
        System.out.println("В массиве нет числа 8");
    }

    //20. Найти количество четных чисел в массиве.
    public static void task20() {
        int countOfEvenNumbers = 0;
        int[] array = new int[]{5, 66, 8, 4, 3, 9, 2, 54, 9};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvenNumbers += 1;
            }
        }
        System.out.println(countOfEvenNumbers);
    }
}
