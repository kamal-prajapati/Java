package HackerRankProblem;

import java.util.Scanner;

public class numOfDigit {

    public static int checkDigit(int digit)
    {
        int counter=0;
        int mynum=digit;
        while(mynum>0)
        {
            mynum = mynum / 10;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String[] y=new String[3];
        int[] num =new int[3];


        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            y[i]=sc.next();
            num[i]=sc.nextInt();


        }





        for(int i=0;i<y.length;i++)

        {

            System.out.print(y[i]);
            for (int j=i;j<=i;j++) {
                int zero = 0;
                int checked = checkDigit(num[j]);

                if (checked < 3) {

                    System.out.println("               "+zero+num[j]);
                } else {
                    System.out.println("               "+num[j]);
                }
            }

        }
        System.out.println("================================");
    }
}




