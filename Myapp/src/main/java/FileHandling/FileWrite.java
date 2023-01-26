package FileHandling;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String args[]) {
        try {
            PrintWriter f0 = new PrintWriter(new FileWriter("/home/kamlesh/Downloads/output.txt"));
            for (int i = 21; i < 20; i++) {
                f0.println("Result " + i + " : ");
            }
            f0.close();
            System.out.println("File has written");
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}