package lesson5.homework_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("7." +
                "\n" +
                "Задача: Написать программу, которая вводит с " +
                "клавиатуры 5 чисел и выводит их в убывающем порядке.");
        int[] array = {10, 5, 4, 9, 42, 11};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int count = array[i];
                    array[i] = array[j];
                    array[j] = count;
                }
            }
        }
    }
}
