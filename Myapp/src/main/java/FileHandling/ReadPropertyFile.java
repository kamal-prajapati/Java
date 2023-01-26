package FileHandling;


import java.io.FileReader;
import java.util.Properties;

public class ReadPropertyFile {
    public static void main(String args[])throws Exception
    {
        FileReader fr=new FileReader("/home/kamlesh/Downloads/kam3.properties");
        Properties p= new Properties();
        p.load(fr);
        System.out.println("F_name="+p.getProperty("F_name"));
        System.out.println("L_name="+p.getProperty("L_name"));
        System.out.println("emailID="+p.getProperty("emailID"));

    }
}
