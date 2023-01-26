package ExternalTestProgram;

import java.util.Scanner;

             /*  Input: kamlesh#%$123prajapati
               output: Special character:#%$
                Number:123
                Character:kamleshprajapati
*/

public class filtercharacterandspecialcharacter {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        String myString =sc.nextLine();
        char[] mychar= myString.toCharArray();

        String spcchr="";
        String num="";
        String chr="";
        for(int i=0;i<=mychar.length-1;i++)
        {
                     char k=mychar[i];
                     if(k>='a' && k<='z')
                     {
                         chr=chr+k;
                     }
                    else if(k>='0'&&k<='9')
                     {
                         num=num+k;
                     }
                   else{
                         spcchr=spcchr+k;
                     }

       }

         System.out.println("Special character:"+spcchr);
         System.out.println("Number:"+num);
         System.out.println("Character:"+chr);


    }
}
