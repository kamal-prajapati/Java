package myProgram;

public class count {
    static  int i=0;
     count()
    {
        i++;
        System.out.println(i);
    }
    public static void main(String args[])
    {
        count c=new count();

        count c1=new count();
        count c2=new count();
    }

}
