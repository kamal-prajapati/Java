public class largestNumber
{
    public static void max(int a[])
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String args[])
    {
        int arr[]={56,23,87,5,10,98};

        max(arr);

    }

}
