package MultiThreading;

public class threadClassMain {
    public static void main(String args[])
    {

        threadClass t1=new threadClass();
        threadclass1 t2=new threadclass1();
        t2.start();
        t1.setName("mythread1");
        t2.setName("myThread2");
        t1.start();
        t2.start();


    }

}
