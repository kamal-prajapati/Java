package Comparable_and_Comparator;

import java.util.*;
import java.io.*;

class Student implements Comparable<Student>
{
    String Name;
    int age;
    int Rollno;

    Student(String Name, int age, int Rollno) {
          this.Name=Name;
          this.age=age;
          this.Rollno=Rollno;

    }
    public int compareTo(Student st) {
        if(age==st.age)
        return 0;
else if(age>st.age)
            return 1;
        else
            return -1;
    }

}
public class comparableTest1 {
    public static void main(String args[])
    {
        ArrayList<Student> ar=new ArrayList<Student>();
        ar.add(new Student("kamlesh",26,8756));
        ar.add(new Student("debasheesh",21,8753));
        ar.add(new Student("Vaibhav",27,87564));
        Collections.sort(ar);
        for(Student st:ar)
        {
            System.out.println(st.Name+" "+st.Rollno+" "+ st.age);
        }

    }

}
