package FileHandling;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String args[]) throws Exception
    {
        FileReader fr=new FileReader("/home/kamlesh/Documents/copied_Command");
        BufferedReader br=new BufferedReader(fr);
        int i;
        //System.out.println(">>>>>>>>>"+br.readLine());
        while((i=br.read())!=-1)
        {
            System.out.print((char)i);
        }
        br.close();
    }
}
