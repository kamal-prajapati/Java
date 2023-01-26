package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static  void main(String args[])
    {
        Map<Integer, String> m=new HashMap<Integer, String>();
        m.put(1,"Ninestars");
        m.put(2,"Google");
        m.put(3,"Microsoft");
        m.put(4,"Netflix");
        m.put(5,"Amazon");
        m.put(6,"Amazon");
        System.out.println(m.get(2));
        System.out.println(m.containsKey(3));
        System.out.println(m.entrySet());
        System.out.println(m.size());


    }
}
