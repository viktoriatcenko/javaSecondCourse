package lesson11;

import java.util.Scanner;

//public class Start {
//    public static void main(String[] args) {
//        //1. �������� ����
//        SaperGame saperGame = new SaperGame();
//
//        //2. �������� ��������� � ������������
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("������� ������� ��������� �� 1-3");
//        System.out.println("1 - ������� ������� ���������");
//        System.out.println("2 - ������� ������� ���������");
//        System.out.println("3 - ������ ������� ���������");
//
//        int level = scanner.nextInt();
//
//        //3. ����������� ���������
//        saperGame.bombsByLevel(level);
//
//        // 4. ���������� ��������������� �����
//        saperGame.placeHelpNumbersOnMap();
//
//        saperGame.printMapGame();
//
//        while (true) {
//            int check = 0;
//            System.out.println("������� ���������� �� ��� � �� 1 �� 10");
//            int pointX = scanner.nextInt();
//            System.out.println("������� ���������� �� ��� Y �� 1 �� 10");
//            int pointY = scanner.nextInt();
//            if (pointX > 10 || pointX < 0 || pointY > 10 || pointY < 0) {
//                System.out.println("������������ ����, ����� �� ����.");
//                continue;
//            }
//            saperGame.printMapGame();
//            /**
//             1 - "��������� ���" (check=1)
//             2 - "�� ��� ������� ������ ����������. �������
//             ���������� ��� ���" (check=2)
//             3- "�����!!! �� ���������!!!" (check=-1)
//             4 - "����������! �� ��������!"
//             * */
//            check = saperGame.checkPointsPlayers(pointX, pointY); // 1, 2 , -1
//            if (check == 2) {
//                System.out.println("�� ��� ������� ������ ����������. ������� ���������� ��� ���");
//            } else if (check == 1) {
//                System.out.println("��������� ���");
//            } else if (check == -1) {
//                System.out.println("�����!!! �� ���������!!!");
//            } else {
//                System.out.println("����������! �� ��������!");
//            }
//            saperGame.printMapGame();
//        }
//
//    }
//}

public class Start {
    public static void main(String[] args) {

        //1. �������� ����
        SaperGame saperGame=new SaperGame();

        //2. �������� ��������� ����
        Scanner scanner=new Scanner(System.in);
        System.out.println("������� ������� ���������, �� 1 �� 3");
        System.out.println("1 - ������� ������� ���������");
        System.out.println("2 - ������� ������� ���������");
        System.out.println("3 - ������ ������� ���������");

        int level = scanner.nextInt();

        // 3. �������� ���������
        saperGame.bombsByLevel(level);

        // 4. ��������� ��������������� �����
        saperGame.placeHelpNumbersOnMap();

        // 5. ����������� ���� � �������
        saperGame.printMapGame();

        // 6. ������ ���
        boolean playing=true;
        while(playing){
            playing=saperGame.doStep();
        }
    }
}
