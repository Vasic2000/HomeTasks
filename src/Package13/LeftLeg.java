package Package13;

import java.util.concurrent.Semaphore;

public class LeftLeg extends Thread {
    Semaphore k;
    Semaphore i;

    public LeftLeg(Semaphore k, Semaphore i) {
        this.k = k;
        this.i = i;
    }


    @Override
    public synchronized void run() {
        while (true) {
            if (k.availablePermits() == 1) {
                System.out.println("Left Leg");
                i.release();
                try {
                    i.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
