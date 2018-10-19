package Package15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread{
    public List<Integer> list;

    public MyThread(List<Integer> list) {
        this.list = list;
    }

    public void run(){
        for(int i = 0; i < 50; i++)
            this.list.add((int)(100 * Math.random()));
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> glist = Collections.synchronizedList(new ArrayList<>());

        Thread thread1 = new MyThread(glist);
        Thread thread2 = new MyThread(glist);
        Thread thread3 = new MyThread(glist);

        long startTime = System.nanoTime();

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread1.join();
        thread1.join();

        long endTime = System.nanoTime();

        System.out.println("Took " + (endTime - startTime)/1000 + " ms");
        System.out.println(glist.size());

        List<Integer> glist2 = new CopyOnWriteArrayList<>();

        Thread thread4 = new MyThread(glist2);
        Thread thread5 = new MyThread(glist2);
        Thread thread6 = new MyThread(glist2);

        long startTime2 = System.nanoTime();

        thread4.start();
        thread5.start();
        thread6.start();

        thread4.join();
        thread5.join();
        thread6.join();

        long endTime2 = System.nanoTime();

        System.out.println("Took " + (endTime2 - startTime2)/1000 + " ms");
        System.out.println(glist2.size());

        List<Integer> glist3 = new ArrayList<>();

        Thread thread7 = new MyThread2(glist3);
        Thread thread8 = new MyThread2(glist3);
        Thread thread9 = new MyThread2(glist3);

        long startTime3 = System.nanoTime();

        thread7.start();
        thread8.start();
        thread9.start();

        thread7.join();
        thread8.join();
        thread9.join();

        long endTime3 = System.nanoTime();

        System.out.println("Took " + (endTime3 - startTime3)/1000 + " ms");
        System.out.println(glist3.size());

    }
}
