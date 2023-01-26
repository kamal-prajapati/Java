package Map;

import java.util.*;
import java.util.Map.Entry;

public class TreeMap {
    public static  void main(String args[])
    {
        Map<Integer,String> m=new java.util.TreeMap<Integer,String>();
        m.put(1,"java");
        m.put(2,"Jdbc");
        m.put(3,"Spring");
        m.put(4,"Hibernate");
        m.put(5,"SpringBoot");

        System.out.println(m);

        Set<Entry<Integer,String>> s= m.entrySet();
        for(Entry<Integer,String> e:s)
        {
            System.out.println(e.getValue());
        }


    }
}
