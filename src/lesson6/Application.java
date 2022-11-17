package lesson6;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /**
         String и его основные методы

         1 - String явлется неизменяемым типом.

         length() - возвращает длину строки

         concat(): объединяет строки / +=

         equals(): сравнивает строки с учетом регистра

         equalsIgnoreCase(): сравнивает строки без учета регистра

         startsWith(): определяет, начинается ли строка с подстроки

         endsWith(): определяет, заканчивается ли строка на определенную подстроку

         String replace(char oldChar, char newChar)
         Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

         String[] split(String regex)
         Разделяет эту строку, окружая данным регулярным выражением.

         trim(): удаляет начальные и конечные пробелы

         toLowerCase(): переводит все символы строки в нижний регистр

         toUpperCase(): переводит все символы строки в верхний регистр

         2 - StringBuffer и StringBuilder
         * */

        char data[] = {'a', 'b', 'c'};
        String str = new String(data);

        int length = data.length;
        System.out.println(length);

        String str1 = "Hello World";
        int lengthOfString = str1.length();
        System.out.println(str1.length());

        String str2 = null;
        String str3 = "World ";

        boolean b = str3.equals("World");
        String str4 = "Иванов";
        String str5 = "иванов";

        boolean c = str4.equalsIgnoreCase(str5);
        System.out.println(c);

        for (int i = 0; i < 1000; i++) {
            String text = "Hello";
            text += "!";
        }

//        System.out.println("Задача 1. Принять от пользователя текст с консоли и перевернуть его." +
//                "Пример: Привет! Результат: !тевирП");
//
//        Scanner scanner =  new Scanner(System.in);
//        String string = scanner.nextLine();
//
//        for (int i = string.length() - 1; i >= 0  ; i -- ) {
//            System.out.print(string.charAt(i));
//        }
        System.out.println("Задача 2. Поиск и замена символов в тексте.");
        System.out.println("/Hello*World!");
        String stringWithError = "/Hello*World!";
        stringWithError = stringWithError.replace("*", " ");
        stringWithError = stringWithError.replace("/", "");
        stringWithError = stringWithError.replace("!", "");
        System.out.println(stringWithError);

        System.out.println("Task 3. Check email for char @"); // mail@yandex.ru
        System.out.println("Text your mail-box");
        Scanner scanner = new Scanner(System.in);
        String eMail = scanner.nextLine();

        // 1
        if (eMail.indexOf("@") == -1) {
            System.out.println("Error. You need to text mail-box with the character @");
            return;
        }

        // 2  mail@yandex@ru
        // mail@yandex.ru
        String [] arr = eMail.split("@");
        int length1 = arr.length;
        if (arr.length != 2) {
            System.out.println("Email contains more than 1 character '@'");
            return;
        }

        // 3 .Mail.@.yAndEx.ru
        String partBeforeDog = arr[0];
        String partAfterDog = arr[1];

        if (partBeforeDog.startsWith(".") || partBeforeDog.endsWith(".")) {
            System.out.println("Incorrect email. Email starts or ends with the point");
            return;
        }

        if (partAfterDog.startsWith(".") || partAfterDog.endsWith(".")) {
            System.out.println("Incorrect email. Email starts or ends with the point");
            return;
        }
        // 4

        if (eMail.contains(" ")) {
            eMail = eMail.trim();
        }

        // 5

        if (eMail.contains("A")) {
            eMail = eMail.toLowerCase();
        }

        // 6

        if (eMail.contains("a")) {
            eMail = eMail.toUpperCase();
        }


        System.out.println("Everything is ok");





    }

}
