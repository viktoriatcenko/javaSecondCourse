package lesson17;

public class MyFirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 100; i < 120; i++) {
            System.out.println("Thread MyFirstThread �������� " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
