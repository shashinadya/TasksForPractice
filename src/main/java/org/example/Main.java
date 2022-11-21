package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Вывести на экран текст "Silence is golden".
        System.out.println("Silence is golden");

        //2. Вывести на экран текущее название дня недели, название месяца и свое имя.
        //Каждое слово должно быть в отдельной строке.
        System.out.println("Monday\nNovember\nNadya");

        //3. Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.
        System.out.println("0\n00\n000\n0000\n00000");

        //4. Вывести на экран прямоугольник, заполненный буквами А. Количество строк в
        // прямоугольнике равно 5, количество столбцов равно 8.

        System.out.println("AAAAAAAA\nAAAAAAAA\nAAAAAAAA\nAAAAAAAA\nAAAAAAAA");

        //5. Вывести на экран букву "W" из символов "*" (звездочка).
        System.out.println("""
                *     *     *
                 *   * *   *
                  * *   * *
                   *     *
                """);

        //6. Вывести на экран результат вычисления 1+2−4.
        System.out.println(1 + 2 -4);

        //7. Вычислите 1/2+1/4. Ответ: 0.75
        double result = 1.0 / 2 + 1.0/ 4;
        System.out.println(result);

        //8. Вычислите значение выражения (a+4b)(a−3b)+a2 при a=2 и b=3. Ответ:  -94

        int a = 2;
        int b = 3;
        System.out.println((a + 4 * b) * (a - 3 * b) + Math.pow(a, 2));

        //14. Пользователь вводит два числа. Найдите сумму и произведение данных чисел.

        Scanner in  = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = in.nextInt();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        in.close();

        System.out.println(num1 + num2);
        System.out.println(num1 * num2);

       //34. Дано число. Если оно больше 3, то увеличить число на 10, иначе уменьшить на 10.

        int number = 5;

        if (number > 3) {
            number += 10;
        }
        else {
            number -= 10;
        }
        System.out.println(number);
    }
}