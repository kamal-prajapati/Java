package LinkedLIst1;

import java.util.*;

public class IteratorExample {
    public static void main(String args[])
    {
        List<String> ls=new ArrayList<String>();
        ls.add("Ninestars");
        ls.add("TCS");
        ls.add("Accenture");
        ls.add("Concentrix");
        ls.add("Css Corp");
        System.out.println(ls);
        Iterator<String> it=ls.iterator();

        while(it.hasNext())
        {
            String s=it.next();
            System.out.println(s);
        }

    }
}
