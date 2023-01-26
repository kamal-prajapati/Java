package MultiThreading;

public class threadClass extends Thread {
    @Override
    public void run() {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=5;i++)
        {
            System.out.println(n);
        }

            }
}
