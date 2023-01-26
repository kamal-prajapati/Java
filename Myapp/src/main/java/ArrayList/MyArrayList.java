
package ArrayList;
import java.util.*;


public class MyArrayList {
    public static void main(String args[]) {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("ninestars");
        ar.add("TCS");
        ar.add("Accenture");
        System.out.println(ar);
        ar.remove("TCS");
        System.out.println(ar);
    }
}