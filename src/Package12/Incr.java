package Package12;

import java.util.concurrent.locks.Lock;

public class Incr extends Thread {

    public int getI() {
        return i;
    }

    int i;

    Lock lock;

    public synchronized void increment() throws InterruptedException {
        Integer in = 0;
        in.wait();
    }

    public static void main(String[] args) throws InterruptedException {
        Incr inc = new Incr();

        Thread th1 = new Incr();
        Thread th2 = new Incr();
        th1.start();
        th2.start();
        th1.join();
        th2.join();
    }

    @Override
    public void run() {
        super.run();
    }
}
