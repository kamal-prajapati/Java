package ExternalTestProgram;
import java.time.*;
import java.util.Scanner;
public class DateFormation {
    public static void main(String args[])
    {
        LocalDate date = LocalDate.now();
        System.out.println(date.minusMonths(7));

        /*String Day=s.split("-")[2];
        String Month=s.split("-")[1];
        String Year=s.split("-")[0];*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Date Format:");
        String s=sc.nextLine();
        String mydate=MydateFormat(s);
        String Day=mydate.split("-")[2];
        String Month=mydate.split("-")[1];
        String Year=mydate.split("-")[0];
        System.out.println(Day+"-"+Month+"-"+Year);
    }
    public static String MydateFormat(String s)
    {   String actualdate="";
        if(s.contains("month") && s.contains("ago"))
        {
            String day=s.split(" ")[0];
            LocalDate date = LocalDate.now();
           actualdate= date.minusMonths(Long.parseLong(day)).toString();
        }
        else if(s.contains("day") && s.contains("ago"))
        {
            String day=s.split(" ")[0];
            LocalDate date = LocalDate.now();
            actualdate= date.minusDays(Long.parseLong(day)).toString();
        }
        else if(s.contains("year") && s.contains("ago"))
        {
            String day=s.split(" ")[0];
            LocalDate date = LocalDate.now();
            actualdate= date.minusYears(Long.parseLong(day)).toString();
        }
        else if(s.contains("week") && s.contains("ago"))
        {
            String day=s.split(" ")[0];
            LocalDate date = LocalDate.now();
            actualdate= date.minusWeeks(Long.parseLong(day)).toString();
        }
        else if(s.contains("min") && s.contains("ago"))
        {
            String day=s.split(" ")[0];
            LocalDate date = LocalDate.now();
            actualdate= date.toString();
        }
        else if(s.contains("sec") && s.contains("ago"))
        {
            String day=s.split(" ")[0];
            LocalDate date = LocalDate.now();
            actualdate= date.toString();
        }
        else if(s.contains("HW") && s.contains("ago"))
        {
            String day=s.split(" ")[0];
            LocalDate date = LocalDate.now();
            actualdate= date.toString();
        }
        else{
            LocalDate date = LocalDate.now();
            actualdate= date.toString();
        }
        return actualdate;
    }

}
