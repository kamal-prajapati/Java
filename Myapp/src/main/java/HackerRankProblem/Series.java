import java.util.*;
import java.io.*;

class Series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            if(i>0)
            {
                System.out.print("\n");
            }

            double s=a;
            for(int j=0;j<n;j++)
            {
                s=s+Math.pow(2,j)*b;

                System.out.print((int)s+" ");


            }



            //String value=String.valueOf(s);
            // seriesValue =seriesValue+s;

        }
        in.close();
    }
}