package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.lang.Number;

public class ArrayTasks2 {
    public static void main(String[] args) {
        //task56();
        task36();
    }

    //56. В массиве заменить все числа, большие данного числа, на среднее арифметическое всех чисел массива.
    public static void task56() {
        double[] array = new double[] {5, 7, 4, 1, 8, 5, 10, 13};
        double n = 8;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                double averageValue = Arrays.stream(array).average().getAsDouble();
                array[i] = averageValue;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //36. Среди элементов с нечетными номерами найдите наибольший элемент массива, который делится на 3.
    public static void task36() {
        int[] array = new int[] {120, 12, 18, 1, 6, 5, 30, 13};
        int maxElementWhichDevidedByThree = 0;
        for (int i = 0; i < array.length; i++) {
           if (i % 2 != 0 & array[i] % 3 == 0) {
               maxElementWhichDevidedByThree = array[i];
           }
        }
        System.out.println(maxElementWhichDevidedByThree);
    }
}
