package ExternalTestProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {
    public static void main(String args[]) {

        System.out.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()));





       /* Date d=new Date();
        long milisecond=d.getTime();
        System.out.println(milisecond);
        String time=format(milisecond);
        System.out.println(time);

    }
    public static String format(long time)
    {
        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy:HH:mm:ss");
        return sdf.format(new Date(time));
    }*/
    }
}