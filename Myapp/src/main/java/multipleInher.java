import java.awt.image.BandCombineOp;

class engineer{
    int salary;
    int age;

}
class softengineer extends engineer{
    String Location;
      softengineer(int salary,int age,String Location)
      {

          this.salary=salary;
          this.age=age;
          this.Location=Location;
      }
}

  public class multipleInher {
    public static void main(String args[])
    {
        softengineer se=new softengineer(1200,22, "bangalore");
        System.out.println(se.age);


    }
}
