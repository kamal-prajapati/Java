package Comparable_and_Comparator;
import java.util.*;
class sorting implements Comparator<sorting> {

    int num;

    sorting(int num)
    {
        this.num=num;
    }

    public int getNum() {
        return num;
    }

    public int compare(sorting a, sorting b)
    {
        return a.num-b.num;
    }
   public static void main(String args[])
   {
       sorting a1=new sorting(60);
       sorting a2=new sorting(15);
       sorting a3=new sorting(17);
       sorting a4=new sorting(4);
       sorting a5=new sorting(10);



   }
}
