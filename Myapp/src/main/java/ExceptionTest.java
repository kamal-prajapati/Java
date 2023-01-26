public class ExceptionTest {
    static void validage( int age)
 {
     if(age<18)
     {
        throw new ArithmeticException("age is not valid");
        
     }
     else{
         System.out.println("you are eligble for vote");
     }
 }
  public static void main(String args[])
    {
        validage(19);
        System.out.println("Hello i m the last line");

    }


}
