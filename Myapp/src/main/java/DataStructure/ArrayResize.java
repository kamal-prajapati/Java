package DataStructure;

public class ArrayResize {
    public static void main(String arg[])
    {
      int[] original=new int[] {5,7,8,3,9};
      System.out.println("the orignial length of array:"+original.length);
      ArrayResize arrayResize=new ArrayResize();
      int[] resizeArray=arrayResize.resize(original, 9);
      System.out.println("The lenght of rezie array:"+resizeArray.length);
      for(int i=0;i<=resizeArray.length-1;i++)
      {
          System.out.println(resizeArray[i]);
      }

    }

    public int[] resize(int[] arr , int capacity) {
        int temp[]=new int[capacity];
        for(int i=0;i<=arr.length-1;i++)
        {
           temp[i]=arr[i];
        }
        return temp;
    }



}
