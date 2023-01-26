package Comparable_and_Comparator;
import java.util.*;
public class TestMain {
public static void main(String args[])
{
    ArrayList<Teacher> ar = new ArrayList<Teacher>();

    // Adding entries in above List
    // using add() method
    ar.add(new Teacher(434, "Mayank", "Gorakhpur"));
    ar.add(new Teacher(245, "vaibhav", "Utter pradesh"));
    ar.add(new Teacher(5763, "Rajech", "Andra pradesh"));
    ar.add(new Teacher(876, "Devasheesh", "odisa"));
    ar.add(new Teacher(111, "kamal", "lucknow"));
    // Display message on console for better readability
    System.out.println("Unsorted");

    // Iterating over entries to print them
    for (int i = 0; i < ar.size(); i++)
        System.out.println(ar.get(i));

    // Sorting student entries by roll number
    Collections.sort(ar, new sortByID());

    System.out.println("After Sorted");
    for (int i = 0; i < ar.size(); i++)
        System.out.println(ar.get(i));
}

}
