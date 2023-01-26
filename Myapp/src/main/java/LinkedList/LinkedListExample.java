package LinkedList;

import java.util.*;

public class LinkedListExample {
    public static void main(String args[]) {
        LinkedList<String> ls = new LinkedList<String>();

        ls.add("12");
        ls.add("10");
        ls.add("6");
        ls.add("56");

        ls.add("54");
        ls.add("53");
        String a[]=new String[5];
         ls.toArray(a);
        for (String element : a)
            System.out.println(element);
    }

}





