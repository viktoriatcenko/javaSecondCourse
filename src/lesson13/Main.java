package lesson13;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        long startPoint = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World!");
        }

        long endPoint = System.currentTimeMillis();
        long result = endPoint - startPoint;

        System.out.println("������ " + a + " ���-�� ��� ������ � ��� " + result);

        People son = new People("����", 12);
        String res = son.getAge() < 16 ? "���, �� ����� ������" : "������� � ����";

        System.out.println(res);

        if (son.getAge() < 16) {
            System.out.println("���, �� ����� ������");
        } else {
            System.out.println("������� � ����");
        }



    }
}
