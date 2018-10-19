package Package12;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic extends Thread {
    AtomicInteger a;

    public Atomic(AtomicInteger a) {
        this.a = a;
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger b = new AtomicInteger(0);

        Thread th1 = new Atomic(b);
        Thread th2 = new Atomic(b);
        th1.start();
        th2.start();
        th1.join();
        th2.join();

        System.out.println(b);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++)
            a.getAndIncrement();
    }
}
