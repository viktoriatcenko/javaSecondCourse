package lesson17.orchestra;

public class Singer2 extends Thread {
    @Override
    public void run() {

        while (true) {
            synchronized (Monitor.MICROPHONE) {
                try {
                    Monitor.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for (int i = 0; i < 2; i++) {
                System.out.println("FAFAFAFA-----------------");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (Monitor.MICROPHONE) {
                    Monitor.MICROPHONE.notify();
            }
        }
    }
}
