package MultiThreading;

public class classTable {
    void prinTable(int n)
    {
        for(int i=1;i<=5;i++) {
            System.out.println(n * i);
            try{
                Thread.sleep(200);
            }
            catch(Exception e)
            {
               System.out.println(e);
            }
        }

    }


}
