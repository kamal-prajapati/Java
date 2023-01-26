package myProgram;
//Write a Java Program to reverse a string without using String inbuilt function reverse().
public class reverString {
    public static void main(String args[])
    {
        String s="Hello i m pramod";
        String []a=s.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }

    }

}
