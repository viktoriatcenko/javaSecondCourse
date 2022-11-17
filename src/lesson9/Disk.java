package lesson9;

public abstract class Disk {
    private String name; // �������� ������
    private int year; // ��� �������

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void printInfo();

}
