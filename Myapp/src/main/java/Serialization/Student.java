package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

        String sName;
        String sAddress;
        int id;

        public static void main(String args[])
        {
         Student st=new Student();
         st.sName="adarsh";
         st.sAddress="BannerGhatta road";
         st.id=2;
         try{
                 FileOutputStream fo=new FileOutputStream("/home/kamlesh/Downloads/ser.txt");
                 ObjectOutputStream out=new ObjectOutputStream(fo);
                 out.writeObject(st);
                 out.close();
         }
         catch(Exception e)
                {

                }
        }

}
