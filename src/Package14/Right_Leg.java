package Package14;

public class Right_Leg implements Runnable {
    Object monitor;
    public Right_Leg(Object monitor) {
        this.monitor = monitor;
    }
    public void run() {
        while(true) {
            synchronized (monitor) {
                System.out.println("Right leg");;
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
