package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaddataFromCSV {
    public static void main(String[] args) throws Exception
    {

//parsing a CSV file into Scanner class constructor
        BufferedReader br = new BufferedReader(new FileReader("/home/kamlesh/Downloads/13-09-2022_13_50_01_InstagramToken.csv"));

           String line="";
           String splitBy = ",";
        while ((line = br.readLine()) != null)  //returns a boolean value
        {
            String[] cols = line.split(splitBy);
            System.out.println(cols[1]);
        }
        br.close();
       /*  String [] ss=line.replace("TokenStatusChannel_idTokenMessage","").split("InActive");
  for(String s:ss){
      //System.out.println(s);
      //48 – 57
      for (char sw:s.toCharArray()){
          if((int)sw>=48 &  (int)sw<=57 ){
              System.out.print(sw);
          }else {
              break;
          }
      }
      System.out.println("");*/
  }


}
