package MultiThreading;

public class firstProgram extends Thread {
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.fillInStackTrace());
            }
            System.out.println(getName());
        }
    }
    public  static  void main(String main[])
    {
        firstProgram t1=new firstProgram();
        firstProgram t2=new firstProgram();
        t1.setName("kamlesh");
        t2.setName("vaibhav");
        t1.start();
        t2.start();
    }
}
