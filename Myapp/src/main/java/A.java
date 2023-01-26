class B implements Runnable
{
  public void  run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("my child thread is executin");
        }
    }
}
public class A {
    public static void main(String args[])
    {
          B b=new B();
          Thread t1=new Thread(b);
        t1.start();
          for(int i=1;i<=5;i++)
          {
              System.out.println("my main thread is excuting");
          }

    }


}
