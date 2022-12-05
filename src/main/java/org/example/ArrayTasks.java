package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayTasks {
    public static void main(String[] args) {
        // task1();
        // task2();
        //task3();
        //task6();
        task6Variant2();
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
}
