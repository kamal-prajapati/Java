package LinkedLIst1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetExample {

    public static  void main(String args[])
    {
        Set<String> s=new LinkedHashSet<>();
        s.add("Yellow");
        s.add("null");
        s.add("red");
        s.add("black");
        s.add("null");
        s.remove("null");
        System.out.println(s.contains("black"));
        //s.clear();
        System.out.println(s.hashCode());
    }
}
