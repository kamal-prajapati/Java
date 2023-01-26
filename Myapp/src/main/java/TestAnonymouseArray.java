public class TestAnonymouseArray {
    public static  void mydata(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        mydata(new int[]{67,43,45,34,86});
    }
}
