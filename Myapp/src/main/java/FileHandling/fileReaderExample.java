package FileHandling;

import java.io.*;

public class fileReaderExample {
    public static void main(String args[]) throws Exception
    {
        FileReader fr=new FileReader("/home/kamlesh/Downloads/kam2.txt");
        int i;
        char ch;
        while((i=fr.read())!=-1)
        {
            ch = (char)i;
            System.out.print(ch);

        }
        fr.close();
    }
}
