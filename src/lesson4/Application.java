package lesson4;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
//        System.out.println();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Проверить число, которое приходит с консоли положительное или отрицательное.");
//        System.out.println("Введите число");
//        int number = scanner.nextInt();
//        if (number > 0) {
//            System.out.println("Число положительное");
//        } else if (number == 0) {
//            System.out.println("Это ноль");
//        } else {
//            System.out.println("Это число отрицательное");
//        }

        /** Циклы
         fori, foreach, while
         * */

//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

        for (int i = 100; i < 105; i ++) {
            System.out.println("Hello World");
        }

        System.out.println("Вывести все четные числа от 1 до 40");

        for (int i = 1; i <= 40; i++) {
//            int number = i % 2;
//            System.out.println(number);
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("Вывести все чмсла от 100 до 150, которые делятся на 3 и на 5 одновременно");

        for (int i = 100; i <= 150; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Вывести все числа от 10 до 0");

        System.out.println();

        for (int i = 10; i >= 0 ; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Summarize all numbers from 10 to 20");


        int num = 0;
        for (int i = 10; i <= 20; i++) {
            num += i;
        }
        System.out.println(num);


        System.out.println("Print all numbers from 10 to 40, skip all numbers from 15 to 20");

        for (int i = 10; i <= 40; i++) {
            if (i < 15 || i > 20) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Summarize all numbers divided by 2 from 10 to 50");

        System.out.println();

        int number = 0;

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                number += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(number);

        /**
         while ( условие выхода ) {
            Алгоритм
         }
          * */



        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            if (scanner.nextLine().equals("/exit"))
//                break;
//        }

        System.out.println("Print all numbers from 0 to 10");

        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("Get number from console and print 'Hello World' times, that equals number");

        int num3 = scanner.nextInt();

        while (num3 > 0) {
            System.out.println("Hello World");
            num3--;
        }
    }
}
