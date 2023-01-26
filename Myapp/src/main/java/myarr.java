public class myarr {

      public int[] get()
      {
          return new int[]{1,5,6,8,9};
      }

      public static void main(String[] args)
    {

        myarr a=new myarr();
       for(int i:a.get())
       {
           System.out.println(i);
       }
    }
}
