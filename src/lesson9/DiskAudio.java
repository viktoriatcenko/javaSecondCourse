package lesson9;

public class DiskAudio extends Disk {
    // 1. ����
    private String singer; // �����������
    private int countTrack; // ���-�� ������

    // 2. ������������

    // 3. ������
    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }


    public int getCountTrack() {
        return countTrack;
    }

    public void setCountTrack(int countTrack) {
        this.countTrack = countTrack;
    }

    @Override
    public void printInfo() {
        System.out.println("Singer: " + getSinger() + " Count of tracks: " + getCountTrack() + " Name of album " +
                getName() + " Year of release: " + getYear());
    }
}
