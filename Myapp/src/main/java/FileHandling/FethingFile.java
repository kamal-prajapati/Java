package FileHandling;

import java.io.File;

public class FethingFile {
    public static  void main(String args[])
    {
        File folder=new File("/home/kamlesh/Documents/MyTextFile/");

        File[] f=folder.listFiles();
        for(File s:f) {
            System.out.println(s.getName());
        }
    }

}
