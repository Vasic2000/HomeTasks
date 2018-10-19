package Package13;

import java.util.concurrent.Semaphore;

public class RightLeg extends Thread {
    Semaphore k;
    Semaphore i;

    public RightLeg(Semaphore k, Semaphore i) {
        this.k = k;
        this.i = i;
    }


    @Override
    public synchronized void run() {
        while (true) {
        if (i.availablePermits() == 1) {
            System.out.println("Right Leg");
            k.release();
            try {
                k.acquire();
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            }
        }
    }
}
