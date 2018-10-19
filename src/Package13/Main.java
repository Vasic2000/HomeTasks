package Package13;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore i = new Semaphore(0);
        Semaphore k = new Semaphore(1);

        new LeftLeg(k, i).start();
        new RightLeg(k, i).start();
    }
}
