package Package10;

import java.util.*;

public class MyThread extends Thread {
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
//        List<Integer> glist = new ArrayList<>();

            Thread thread1 = new MyThread(glist);
            Thread thread2 = new MyThread(glist);
            Thread thread3 = new MyThread(glist);

            long startTime = System.nanoTime();

            thread1.run();
//            thread1.start();
//            thread2.start();
//            thread3.start();

            thread1.join();
//            thread2.join();
//            thread3.join();

            long endTime = System.nanoTime();

            System.out.println("Took " + (endTime - startTime)/1000 + " ms");
            System.out.println(glist.size());


        List<Integer> glist2 = new Vector<>();

        Thread thread4 = new MyThread(glist2);
        Thread thread5 = new MyThread(glist2);
        Thread thread6 = new MyThread(glist2);

        long startTime2 = System.nanoTime();

        thread4.run();
//        thread4.start();
//        thread5.start();
//        thread6.start();

        thread4.join();
//        thread5.join();
//        thread6.join();

        long endTime2 = System.nanoTime();

        System.out.println("Took " + (endTime2 - startTime2)/1000 + " ms");
        System.out.println(glist2.size());



    }
}
