package MultiThreading;

public class tableMain {
    public static void  main(String args[])
    {
        classTable ct=new classTable();
        tableThread1 th1=new tableThread1(ct);
        tableThread2 th2=new tableThread2(ct);

        th1.start();
        th2.start();


    }
}
