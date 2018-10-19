package Package11;

import java.util.Scanner;

public class MyThread2 extends Thread {

    Scanner scanner = new Scanner(System.in);
    static String a = "";

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new MyThread2();
        Thread th2 = new MyThread2();
        th1.start();
        th2.start();
        th1.join();
        th2.join();

        System.out.println(a);
        System.out.println(a.length());
    }

    @Override
    public void run() {
        for(int i = 0; i < 50; i++) a = a + "A";
    }
}
