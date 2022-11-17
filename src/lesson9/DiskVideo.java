package lesson9;

public class DiskVideo extends Disk {

    // 1. Fields
//    private String name; // �������� ������
//    private int year; // ��� �������
    private String director; // ��������
    private String genre; // ����
    private int time; // ������������

    // 2. Constructors

    // 3. Methods

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void printInfo() {
        System.out.println("Director: " + getDirector() + " Time of film: " + getTime() + " Name of film " +
                getName() + " Year of release: " + getYear() + " Genre: " + getGenre());
    }
}
