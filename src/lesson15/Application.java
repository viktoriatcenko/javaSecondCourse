package lesson15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

public class Application {
    public static void main(String[] args) {
//        "--------------------------------------------------------------"
//        System.out.println("1. ������� ������ Exception");
//        int a = 10;
//        int b = 0;
//        System.out.println(a / b);
//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(0);
//        "---------------------------------------------------------------"
//        System.out.println("2. Exception / null ");
//        String text = null;
//        System.out.println(text.length());
//
//        NullPointerException nullPointerException = new NullPointerException();
//        nullPointerException.printStackTrace();
//        System.exit(0);

//        "-----------------------------------------------------------------"
        System.out.println("3. ����� Exception � ������� if/else");
        String password = null;
//        System.out.println(password.length());
        if (password != null) {
            System.out.println(password.length());
        }

        System.out.println("����������� ���������");
//        "-------------------------------------------------------------------"
        System.out.println("4. ��������� Exception ��� if/else");
        try {
            Files.copy(new File("D:/programs/User/Desktop/file.jpeg").toPath(),
                    new File("D:/programs/User/Desktop/newfile.jpeg").toPath());
        } catch (Throwable e) {
//            e.printStackTrace();
        }
//        System.out.println("===================================================================");
        System.out.println("5. ��� ���� ������ � try/catch");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("====================================================================");
        System.out.println("6.Try/ catch/ finally");

        try {
            Files.copy(new File("D:/programs/User/Desktop/file.jpeg").toPath(),
                    new File("D:/programs/User/Desktop/newfile.jpeg").toPath());
        } catch (NoSuchFileException e) {
//            e.printStackTrace();
            System.out.println("File ����� ������ ����������");
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("���� �� ������");
        } catch (IOException e) {
            System.out.println("�������� ��������� ������, ��� ����������");
        } finally {
            // ����� ��������� ����, ������� ������, �������� ���, ������� ������ � ��� ��������������
        }


        Dog dog = new Dog("�����");
        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyToWalkException e) {
            e.printStackTrace();
        }

    }
}
