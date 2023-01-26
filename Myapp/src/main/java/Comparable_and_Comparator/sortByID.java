package Comparable_and_Comparator;

import java.util.Comparator;

public class sortByID implements Comparator<Teacher> {
    public int compare(Teacher a ,Teacher b)
    {
        return a.id - b.id;
    }

}
