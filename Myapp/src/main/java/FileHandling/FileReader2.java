package FileHandling;
import java.io.*;
public class FileReader2 {
    // Main driver method
    public static void main(String[] args)
    {
        FileReader reader;

        // Try block to check if exception occurred
        try {

            // A FileReader to read data from "geeks.txt"
            // File present in local directory
            reader = new FileReader("/home/kamlesh/Downloads/kam2.txt");

            char ch;

            // An integer to store the integer
            // returned by FileReader#read() method
            int i = -1;

            // Stores the initial current time
            long initialTime = System.currentTimeMillis();
            while (true) {
                try {
                    // The read() method of FileReader
                    // reads one character at a time
                    // and returns it as an integer
                    i = reader.read();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }

                // When the "End Of File" is reached
                // the read() method returns -1
                if (i == -1)
                    break;

                ch = (char)i;
                System.out.print(ch);
            }

            // New line
            System.out.println();

            // Display and print the time taken
            System.out.println("Time taken : "
                    + (System.currentTimeMillis()
                    - initialTime));

            try {
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
