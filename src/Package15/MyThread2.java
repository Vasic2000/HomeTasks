package Package15;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread {
    public List<Integer> list;
    Lock lock;

    public MyThread2(List<Integer> list)
    {
        Lock lock = new ReentrantLock();
        this.list = list;
    }
// Сделать, чтобы работало!
    public void run(){
        lock.lock();
        for(int i = 0; i < 50; i++)
            this.list.add((int)(100 * Math.random()));
        lock.unlock();
    }
}
