package Package12;

public class NoAtomic extends Thread {
    static int a;

    public NoAtomic(int a) {
        this.a = a;
    }

    public static void main(String[] args) throws InterruptedException {
        int b = 0;

        Thread th1 = new NoAtomic(b);
        Thread th2 = new NoAtomic(b);
        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(b);
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++)
            a++;
    }
}
