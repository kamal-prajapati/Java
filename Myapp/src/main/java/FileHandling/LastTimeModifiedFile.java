package FileHandling;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LastTimeModifiedFile {
    public static void main(String args[])
    {
        File f=new File("/home/kamlesh/Downloads");
        /*long lastModified= f.lastModified();
        String time=format(lastModified);
        System.out.println(time);
        File file[]=f.listFiles();
        System.out.println(file[file.length-1].getName());*/
        File[] farr=f.listFiles();
        System.out.println();

    }
    public static String format(long time)
    {
        DateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        return sdf.format(new Date(time));
    }
}
