package String;

import java.util.Calendar;
//print the date like: June 19, 2017
//3:13 pm
public class Time {
    public static void main(String args[])
    {
        Calendar c=Calendar.getInstance();
        int AM_PM=1;
        String a =c.get(Calendar.AM_PM)==1 ? "AM":"PM";
        System.out.println(c.getTime().toString().split(" ")[1]+" "+c.getTime().toString().split(" ")[2]+", "+c.getTime().toString().split(" ")[5]);
        //String time=c.getTime().toString().split(":")[3];
        //int s=Integer.parseInt(time.split(":")[0]);
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" "+a);
    }
}
