package MultiThreading;


 class A implements Runnable {
   public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread Count:"+i);
        }
    }

}


public class FirstThreadExample {
    public static void main(String args[])
    {
        FirstThreadExample ft=new FirstThreadExample();
        A t1=new A();
        t1.start();
        ft.count();

    }
    public void count()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Count:"+i);
        }
    }
}
