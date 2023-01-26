package MultiThreading;

public class threadclass1 extends  Thread {
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1;i<=5;i++) {
            System.out.println(n);
            Thread.yield();
        }
    }

}
