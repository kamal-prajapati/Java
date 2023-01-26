package Map;
import java.util.*;
import java.util.Map.Entry;
public class HasMap {
    public static void main(String args[])
    {
        Map<Integer,String> m1=new HashMap<Integer,String>();
        m1.put(1,"Rohit");
        m1.put(2,"Raina");
        m1.put(3,"Dhoni");
        m1.put(4,"jadeja");

        Set<Entry<Integer,String>> s= m1.entrySet();

        for(Entry<Integer,String>entry:s)
        {
                 System.out.println(entry);
        }









    }
}
