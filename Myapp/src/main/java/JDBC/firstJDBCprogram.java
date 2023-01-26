package JDBC;


import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class firstJDBCprogram {
    public static void main(String args[])
        {
            try{
                FileOutputStream outer = new FileOutputStream("/home/kamlesh/Downloads/Kamal.csv");
                OutputStreamWriter outWriter = new OutputStreamWriter(outer,"utf-8");
                outWriter.write("ID,Name,Feeder_Day_Range,Feeder_Page_Range,Country\n");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/brandtology?characterEncoding=latin1","root","password");
                Statement st=con.createStatement();
                String q="Select ID,Name,Feeder_Day_Range,Feeder_Page_Range,Country from brandtology.Channel where Feeder_Day_Range=60 and Feeder_Page_Range=0 and Country='VN' limit 5";
                ResultSet rs=st.executeQuery(q);

                Collection<Channel_Detail> ch=new ArrayList<>();
                while(rs.next())
                {
                    String ID=rs.getString(1);
                 String Name=rs.getString(2);
                 String Feeder_Day_Range=rs.getString(3);
                 String Feeder_Page_Range=rs.getString(4);
                 String Country=rs.getString(5);

                    Channel_Detail cd =new Channel_Detail();
                    cd.setChannelID(ID);
                    cd.setChannelName(Name);
                    cd.setFeeder_Day_Range(Feeder_Day_Range);
                    cd.setFeeder_Page_Range(Feeder_Page_Range);
                    cd.setCountry(Country);

                    outWriter.write(cd.getChannelID()+","+cd.getChannelName()+","+cd.getFeeder_Day_Range()+","+cd.getFeeder_Page_Range()+","+cd.getCountry()+"\n");



                    System.out.println(ID+" "+Name+" "+Feeder_Day_Range+" "+Feeder_Page_Range+" "+Country);


                }
                outWriter.flush();
                outWriter.close();
            }
            catch (Exception e)
            {
                System.out.println(e);

            }
        }

    }


