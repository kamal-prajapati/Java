public class evenArray {
    public static int countEven(int[] nums) {
        int  count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
                System.out.println(nums[i]);
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int arr[]={3,43,6,8,12};
        System.out.println("number of even number="+countEven(arr));
    }
}
