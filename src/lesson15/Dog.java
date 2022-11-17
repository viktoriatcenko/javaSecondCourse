package lesson15;

public class Dog {
    // ����
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePuton;

    // �����������

    public Dog(String name) {
        this.name = name;
    }


    // ������
    public void putCollar() {
        System.out.println("������� �����");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("������� �����");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("��������� �����");
        this.isMuzzlePuton = true;
    }

    public void walk() throws DogIsNotReadyToWalkException {
        System.out.println("���� ������!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePuton) {
            System.out.println("�������, ���� ������!");
        } else {
            throw new DogIsNotReadyToWalkException("������ " + name + " �� ������!");
        }
    }


}
