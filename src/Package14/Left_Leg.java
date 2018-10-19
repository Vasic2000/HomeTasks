package Package14;

public class Left_Leg implements Runnable {
    Object monitor;
    Left_Leg(Object monitor) {
        this.monitor = monitor;
    }
    public void run() {
        while(true) {
            synchronized (monitor) {
                System.out.println("Left leg");;
                monitor.notify();
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
