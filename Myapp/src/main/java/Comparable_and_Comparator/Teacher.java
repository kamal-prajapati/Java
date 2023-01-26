package Comparable_and_Comparator;



public class Teacher {
    int id;
    String Name , address;

    Teacher(int id, String Name, String address)
    {
        this.id=id;
        this.Name=Name;
        this.address=address;
    }
    public String toString()
    {

        // Returning attributes of Student
        return this.id + " " + this.Name + " "
                + this.address;
    }
}
