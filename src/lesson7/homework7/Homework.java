package lesson7.homework7;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /**
         ������: ��������� ������ ������, ���� ������������ �� ����� ������ ������ (����� enter).
         ����� ��� ������������ ������ � ������� ������� (���� ������������ � ����) � ������� �� �� �����.

         ����� ������: ��������� ������ ������, ���� ������������ �� ����� ������ ������ (����� enter).
         ���� � ������ ������ ����� ����, ������ �����������, ���� �������� - �����������.
         ��������� ������� ����� �� �����.
         * */
//        Scanner scanner = new Scanner(System.in);
//        String [] strings = new String[100];
//        int count = 0;
//        while (true) {
//            String str = scanner.nextLine();
//            if (str.isEmpty()) {
//                break;
//            }
//            System.out.println("������� �����");
//            strings[count] = str.toUpperCase();
//            count++;
//        }
//        for (int i = 0; i < 3; i++) {
//            if (strings[i].length() % 2 == 0) {
//                System.out.println(strings[i] + " " +  strings[i]);
//            } else {
//                System.out.println(strings[i] + " " +  strings[i] + " " +  strings[i]);
//            }
//        }

        System.out.println("1. ������� ������ �� 20 �����.\n" +
                "2. ������ � ���� �������� � ����������.\n" +
                "3. ������� ��� ������� �� 10 ����� ������.\n" +
                "3.1 ������������� ������ �� 20 �����.\n" +
                "4. ����������� ������� ������ � ��� ���������: �������� ����� � ������ ���������," +
                " ������ �������� �� ������ ���������.\n" +
                "5. ������� ������ ��������� ������ �� �����, ������ �������� �������� � ����� ������.");

        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int [] array1 = new int[10];
        int [] array2 = new int[10];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 20; i++) {
//            array[i] = scanner.nextInt();
//        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int count = array[i];
                    array[i] = array[j];
                    array[j] = count;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            array1[i] = array[i];
            array2[i] = array[i + 10];
        }

    }

}
