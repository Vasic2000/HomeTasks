package Package14;


public class Robot {
    public final Object monitor = new Object();
    Left_Leg left = new Left_Leg(monitor);
    Right_Leg right = new Right_Leg(monitor);
    void run() {
        new Thread(left).start();
        new Thread(right).start();
    }
    public static void main(String[] args) {
        new Robot().run();
    }
}
