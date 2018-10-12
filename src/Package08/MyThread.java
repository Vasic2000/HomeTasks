package Package08;

public class MyThread implements Runnable {
    public static int i = 0;

    @Override
    public void run() {
        for(int n = 0; n < 5000; n++) i++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread());
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());

        thread.start();
        thread1.start();
        thread2.start();
        //thread.join();
        //thread1.join();
        //thread2.join();
        for(int n = 0; n < 5000; n++) i++;

        System.out.println(i);
    }
}
