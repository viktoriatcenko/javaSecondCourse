package lesson9;

import lesson8.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        /**
         * ��� - ��������-��������������� ����������������. �������� ��������:
         1. ������������ - ������� ���������, ����������� ����� ������������ �������:
         public - �����/����� ����� �������� ������ ���� ������� ����� ������� (99% ������� ����������
         protected - ������ ������ � ��� �����������, �� ���� �������� �������, ������������� � ������ ?
         --------- ����� �������� ������ ������ �������� ������ (������� �����);
         private - ������ ������ �������� ������ (�����);
         2. ������������ - extends - ��� ��������, ������� ��������� ��������� ������ �� ������
         ������ ������� �������� �� ������ � �������� (�����������) �������.
         3. ���������� - �������� ��������� �������, �������� �������� ������������� �������� �
         �������� - ������������ ��������������, ��������������.
         4. ����������� - ��� ����������� ��������� ��������� ������������ ������� � ���������� �����������
         ��� ���������� � ���������� ���� ����� �������.
         �� ����� �������� �� ������� ������, ��� � ����� (��� �������, ��� ��� ���� �������� ������������ (���������)
         �� �������� (��������) ����).
         * */

        /**
         ��� �������� ����� �� ������������� ����� extends ����� �������� �� "�������� ��",
         ��� ����������� �� ����� ���������� ���� ������� ������ �������[] ���� = �������[5];
         ����� � ��� ����� ������� ������� ����������� ������� ������ � ��������, � ����� ���� �� ��������,
         �������� ������ ����� �������� �� ���������������
         � ����������������.
         * */


        // ������ 1. �������� ������ � ������������ ������� � ������� � ��������.
        DiskVideo diskVideo1 = new DiskVideo();
        diskVideo1.setName("Rembo");
        diskVideo1.setDirector("Mark Polo");
        diskVideo1.setGenre("Action");
        diskVideo1.setTime(120);
        diskVideo1.setYear(1982);

        DiskVideo diskVideo2 = new DiskVideo();
        diskVideo2.setName("Terminator");
        diskVideo2.setDirector("������");
        diskVideo2.setGenre("Fantastic");
        diskVideo2.setTime(90);
        diskVideo2.setYear(1984);

        DiskAudio diskAudio1 = new DiskAudio();
        diskAudio1.setName("���� �����");
        diskAudio1.setYear(1995);
        diskAudio1.setCountTrack(12);
        diskAudio1.setSinger("�. �����");

        DiskAudio diskAudio2 = new DiskAudio();
        diskAudio2.setName("�������� ���");
        diskAudio2.setYear(1987);
        diskAudio2.setCountTrack(11);
        diskAudio2.setSinger("�. �������");

        diskAudio1.printInfo();
        diskAudio2.printInfo();
        diskVideo1.printInfo();
        diskVideo2.printInfo();

        Disk[] disks = new Disk[4];
        disks[0] = diskAudio1;
        disks[1] = diskAudio2;
        disks[2] = diskVideo1;
        disks[3] = diskVideo2;
        UtilDisk.findOldDisk(disks);









        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

    }

    public static void test(Animal animal) {
        animal.eat();
    }


}
