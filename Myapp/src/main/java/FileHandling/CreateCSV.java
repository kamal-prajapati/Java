package FileHandling;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class CreateCSV {
    public static void main(String args[])
    {
           try{

               String Name="karan";
               String SiteType="News";
               String Main=Name+","+SiteType+"\r\n";
               FileOutputStream outer = new FileOutputStream("/home/kamlesh/Downloads/Kamal.csv");
               OutputStreamWriter outWriter = new OutputStreamWriter(outer,"utf-8");
               outWriter.write("Name,Site_Type,Influence_Calculation_ID,Language,URL,Max_Concurrent_Threads,Rate_Feeder,Rate_Crawler,Rate_Monitor,Rate_Search,Location_Feeder,Location_Crawler,Location_Monitor,Location_Search,Num_Inlinks,DateTime_Started,Category,Country,Feeder_Day_Range,Crawler_Day_Range,Monitor_Day_Range,Search_Day_Range,Feeder_Page_Range,Crawler_Page_Range,Monitor_Page_Range,Search_Page_Range\r\n");
               for(int i=0;i<=2;i++) {
                   outWriter.write(Main);
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
