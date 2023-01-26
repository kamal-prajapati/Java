import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class My_Program {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        String user_input = sc.nextLine();
        String[] stringsArray = user_input.split(" ");
        int addresult=0;
        int mulresult=1;

           if(stringsArray[0].equals("sum")) {
               for (int i = 1; i < stringsArray.length; i++) {

                   addresult +=Integer.parseInt(stringsArray[i]);
               }
               System.out.println(addresult);
           }
           else{
               for (int i = 1; i < stringsArray.length; i++) {

                   mulresult *=Integer.parseInt(stringsArray[i]);
               }
               System.out.println(mulresult);
           }

    }
}















