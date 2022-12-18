package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.lang.Number;

public class ArrayTasks2 {
    public static void main(String[] args) {
        //task56();
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


}
