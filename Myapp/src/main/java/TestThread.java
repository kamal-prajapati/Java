public class TestThread extends  Thread{
   public void run()
    {
        for(int i=1;i<=5;i++) {
            System.out.println(getName());

        }
    }
    public static  void main(String args[])
    {
        TestThread t1=new TestThread();
        TestThread t2=new TestThread();
       t1.start();
        t1.setName("FirstThread");
        t2.start();
        t2.setName("SecondThread");


    }


}
