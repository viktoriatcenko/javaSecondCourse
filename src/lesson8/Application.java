package lesson8;


public class Application {
    public static void main(String[] args) {
        /**������-
         �������� ������ (�����) ������ ����� �������� �� ������ ����� � ��� ������� ������.
         ������ ����� ��������� �� ������� �� ������ ������ (�����), �� ������ ���� ��� ������
         ������� � ����� ������;

         ������� �������� ������-
         1- ����������� ������� - ��� ���� �� 4-� ����� ����, ����������� ����� �������
         ��� �������:
         public - �����/����� ����� �������� ������ ���� ������� ����� �������
         (99% ������� ������������);
         protected - ������ ������ � ��� �����������, �� ���� �������� �������,
         ������������� � ������ ������� � ������ �������;
         ------------ ����� �������� ������ ������
         �������� ������ (������� �����);
         private - ������ ������ �������� ������ (�����);

         -����������� - ��� ��������: ����� ���� ������ ������� �����������, ���� ���:
         - �� static, ���� ����� ����� ���������� � ���������� text.split(" ");,
         �� �� �� ������ ���� static;
         static - ���� ����� ����� ���������� � �u��
         String.copyValue0f(char[] data);

         -������������ ��� ��� ����� void ���� ����� �� ���� �� ����������:
         public static int - ���� ����� ����� ���������� �����; public static char[] -
         ���� ���������� ������ ��������;
         public static String - ���� ���������� ������;
         public static ****** - ������ �������� ������������ �����;
         public static void - ���� �� ���� �� ����������, � ������ �����������,
         ��������, ������ �� �������;

         4 - �������� ������: ���������� ��� ����, � ��������� �����;

         5 - �������� ��������� � ������� ������� ���� ��� ����� ����� ������� � ��������� ����

         6 - ���� ������ (�� ��� ������ �����������, ����� ����� �������);

         public static void 				printMassiveToConsole(int[][] mass)
         ������������ ������� ������			��������� ������
         */

        // ������������ � �������� �������� �������

        String s1 = new String("");
        Contact viktor = new Contact("������", "fjhgkjdhgkhdkj@mail.ru", "89316251423");
        Contact denis1 = new Contact("�����", "fjhgkjddkj@mail.ru", "89316251424");
        Contact denis2 = new Contact("�����", "fjhgkjdhkj@mail.ru", "89316251425");
        Contact alex = new Contact("���������", "fjhgkjdhgkhdkj12313@mail.ru", "89316251426");
        Contact vasilii = new Contact("�������", "fjhgkjdhgkhdkj1111@mail.ru", "89316251427");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(viktor);
        phoneBook.addContact(denis1);
        phoneBook.addContact(denis2);
        phoneBook.addContact(alex);
        phoneBook.addContact(vasilii);
        phoneBook.search("������");
        phoneBook.edit("������", "�������");
        phoneBook.delete("�������");
        System.out.println(phoneBook);
    }

}
