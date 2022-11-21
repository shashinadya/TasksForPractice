package org.example;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //task35();
        //task36();
        //task37();
        //task38();
        //task39();
        //task40();
        //task41();
        //task42();
        //task43();
        task44();
    }

    //35. Дано число. Если оно меньше 7, то вывести Yes, если больше 10, то вывести No, если равно 9, то вывести Error.
    public static void task35() {
        int a = 9;

        if (a < 7) {
            System.out.println("Yes");
        } else if (a > 10) {
            System.out.println("No");
        } else if (a == 9) {
            System.out.println("Error");
        }
    }

    //36. Пользователь вводит номер месяца, вывести название месяца.
    public static void task36() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number of month");
        int month = in.nextInt();
        in.close();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }

    //37. Дано два числа. Вывести наибольшее из них.
    public static void task37() {
        int a = 5;
        int b = 7;

        System.out.println(Math.max(a, b));
    }

    //38. Дано два числа. Вывести yes, если они отличаются на 100, иначе вывести No.
    public static void task38() {
        int a = 120;
        int b = 20;

        if ((a - b) >= 100) {
            System.out.println("Yes");
        } else if ((b - a >= 100)) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }

    //39. Даны два числа. Если первое число больше второго, то вывести yes, иначе поменять значения
    // этих переменных и вывести их на экран.
    public static void task39() {
        int a = 10;
        int b = 500;

        if (a > b) {
            System.out.println("yes");
        } else {
            int c = a;
            a = b;
            b = c;
            System.out.println(a);
            System.out.println(b);
        }
    }

    //40. Дано число. Если оно от -10 до 10 не включительно, то увеличить его на 5, иначе уменьшить на 10.
    public static void task40() {
        int a = -10;

        if ((a > -10) & (a < 10)) {
            a = a + 5;
            System.out.println(a);
        } else {
            a = a - 10;
            System.out.println(a);
        }
    }

    //41. Дано число. Если оно более 100 или менее -100, то занулить, иначе увеличить его на 1.
    public static void task41() {
        int a = -120;

        if ((a > 100) & (a < -100)) {
            a = 0;
            System.out.println(a);
        } else {
            a++;
            System.out.println(a);
        }
    }

    //42. Дано число. Если оно от 2 до 5 включительно, то увеличить его на 10. Если оно от 7 до 40,
    // то уменьшить на 100. Если оно не более 0 или более 3000, то увеличить в 3 раза (то есть умножить на 3).
    // Иначе занулить это число.
    public static void task42() {
        int a = 11;

        if (a >= 2 & a <= 5) {
            a += 10;
        } else if (a >= 7 & a <= 40) {
            a -= 100;
        } else if (a < 0 & a > 3000) {
            a *= 3;
        } else {
            a = 0;
        }
        System.out.println(a);
    }

    //43. Пользователь вводит номер месяца. Вывести название поры года (весна, лето и т.д.)
    public static void task43() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number of month");
        int month = in.nextInt();
        in.close();
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }
    }

    //44. Пользователь вводит два числа. Если они не равны 10 и первое число четное, то вывести их сумму,
    // иначе вывести их произведение.

    public static void task44() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1");
        int number1 = in.nextInt();
        System.out.println("Введите число 2");
        int number2 = in.nextInt();
        in.close();

        if (number1 != 10 & number2 != 10 & number1 % 2 == 0) {
            System.out.println(number1 + number2);
        } else {
            System.out.println(number1 * number2);
        }
    }
}
