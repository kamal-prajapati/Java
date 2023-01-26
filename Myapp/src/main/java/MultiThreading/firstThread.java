package MultiThreading;

public class firstThread extends  Thread {
    @Override
    public void run() {
        for(int i=0;i<=5; i++) {

            System.out.println(i);

        }

    }
    public  static  void main(String args[])
    {
        firstThread t1=new firstThread();
        firstThread t2=new firstThread();
        t1.start();
        t2.start();
        t1.setName("firstThread");
        t2.setName("SecondThread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

    }
}
