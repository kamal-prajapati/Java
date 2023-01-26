import java.util.Scanner;

public class spaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String sss = x + "";

            if (sss.length() == 3) {
                sss = sss;
            } else if (sss.length() == 2) {
                sss = "0" + sss;
            }
            if (sss.length() == 1) {
                sss = "00" + sss;
            }

            System.out.println(spaces.makeString(s1) + sss);
            //System.out.println(s1+"           "+x);
        }

        System.out.println("================================");

    }

    public static String makeString(String s1) {

        int spacecount = 15 - s1.length();
        String space = "";
        for (int i = 0; i < spacecount; i++) {
            space = space + " ";
        }

        return s1 + space;
    }

}




