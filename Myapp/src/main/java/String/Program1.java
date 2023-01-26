package String;
//Write a Java program to create a new String object with the contents of a character array.
public class Program1 {
    public static void main(String args[])
    {
        char[] arr_num= new char[]{1,2,3,4};
        String s=" ";
                s=s.copyValueOf(arr_num,1,2);
        System.out.println(s);
    }
}
