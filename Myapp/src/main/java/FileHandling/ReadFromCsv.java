package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFromCsv
{
    public static void main(String[] args)
    {
        String line = "";
        String splitBy = ",";
        try
        {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/home/kamlesh/Downloads/Kamal.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] employee = line.split(splitBy);    // use comma as separator
                System.out.println(employee[0]);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

