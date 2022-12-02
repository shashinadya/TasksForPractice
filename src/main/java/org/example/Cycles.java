package org.example;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Cycles {
    public static void main(String[] args) {
        //task75();
        //task76();
        //task77();
        //task79();
        //task80();
        //task85();
        task107();
    }

    //75. Выведите на экран 10 раз фразу "You are welcome!"
    public static void task75() {
        for (int i = 0; i < 10; i++) {
            System.out.println("You are welcome!");
        }
    }

    //76. Выведите на экран n раз фразу "Silence is golden". Число n вводит пользователь.
    public static void task76() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int n = in.nextInt();
        in.close();

        for (int i = 0; i < n; i++) {
            System.out.println("Silence is golden");
        }
    }

    //77. Выведите на экран прямоугольник из нулей. Количество строк вводит пользователь, количество столбцов равно 5.
    public static void task77() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = in.nextInt();
        in.close();

        int m = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("0 ");
            }
            System.out.print("\n");
        }
    }

    //79. Выведите на экран числа 1, 2, 3, 4, ..., 20.
    public static void task79() {
        int a = 1;
        int b = 20;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    //80. Вывести на экран ряд чисел 1001,  1004,  1007,  ... 1025.
    public static void task80() {
        int a = 1001;
        int b = 1025;
        do {
            System.out.println(a);
            a += 3;
        }
        while (a <= b);
    }

    //85. Для данного n найти сумму 1+2+3+...+n. Например, для n=10 ответ равен 55.
    public static void task85() {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //107. Вывести ряд чисел: десять десяток, девять девяток, восемь восьмерок, ... , одну единицу.
    // Найти сумму всех этих чисел.
    public static void task107() {
        int sum = 0;
        int n = 10;
        do {
            for (int i = 0; i < n; i++) {
                if (i == n)
                    break;
                System.out.print(n + " ");
            }
            System.out.println("\n");
            n = n - 1;
        }
        while (n >= 1);
    }
}
