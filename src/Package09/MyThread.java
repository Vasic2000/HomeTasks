package Package09;

public class MyThread extends Thread {
    public String str;
    public static int i = 0;

    public MyThread(String str) {
        this.str = str;
    }


    @Override
    public void run() {
        for (int n = 0; n < 10; n++)
            System.out.println("Hey, " + str);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread("Egg"));
        Thread thread2 = new Thread(new MyThread("Chiken"));

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();



    }
}
