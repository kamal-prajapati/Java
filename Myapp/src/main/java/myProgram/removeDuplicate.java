package myProgram;

public class removeDuplicate {
    public static  void main(String args[])
    {
        String s="Hello Hello this is is kamlesh";
        String[] remove= s.split(" ");
        String[] newValue=s.split(" ");
        String newstring="";
        for(int i=0;i<=remove.length-1;i++)
        {
            for(int j=i+1; j<=newValue.length-1;j++)
            {
                if(remove[i].equals(newValue[j]))
                {

                    remove[i]="";
                    break;
                }
            }
            System.out.print(" "+remove[i]);

        }




    }
}
