package JDBC2;

import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class readJson {
    public static void main(String args[])
    {
        try{
            JSONParser parser = new JSONParser();
            FileReader fr=new FileReader("/home/kamlesh/Downloads/xyz.json");
            Object obj = parser.parse(fr);
            System.out.println(obj);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
