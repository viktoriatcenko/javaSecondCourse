package lesson17.orchestra;

public class Singer1 extends Thread{
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop) {
            for (int i = 0; i < 3; i++) {
                count++;

                if (count > 3) {
                    needStop = true;
                }
                System.out.println("-----------------LALALALA");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (Monitor.MICROPHONE) {
                Monitor.MICROPHONE.notify();
            }

            synchronized (Monitor.MICROPHONE) {
                try {
                    Monitor.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
