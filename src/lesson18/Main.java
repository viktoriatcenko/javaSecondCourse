package lesson18;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IOFilesCopy ioFilesCopy = new IOFilesCopy();
        ioFilesCopy.copy("C:\\Users\\Admin\\Downloads\\postgresql-14.5-1-windows-x64.exe", "1.exe");
        long finish = System.currentTimeMillis();
        System.out.println("� ����������� IO " + (finish - start));


        long start1 = System.currentTimeMillis();
        NIOFilesCopy nioFilesCopy = new NIOFilesCopy();
        nioFilesCopy.copy("C:\\Users\\Admin\\Downloads\\postgresql-14.5-1-windows-x64.exe", "2.exe");
        long finish1 = System.currentTimeMillis();
        System.out.println("� ����������� NIO " + (finish1 - start1));


        long start2 = System.currentTimeMillis();
        ApacheCommonIOCopy apacheCommonIOCopy = new ApacheCommonIOCopy();
        apacheCommonIOCopy.copy("C:\\Users\\Admin\\Downloads\\postgresql-14.5-1-windows-x64.exe", "3.exe");
        long finish2 = System.currentTimeMillis();
        System.out.println("� ����������� Apache " + (finish2 - start2));
    }
}
