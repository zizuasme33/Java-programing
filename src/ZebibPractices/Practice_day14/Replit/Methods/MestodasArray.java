package ZebibPractices.Practice_day14.Replit.Methods;
import java.util.*;
public class MestodasArray {
    public static void main(String[] args) {
        //  int[] i = new int[new Scanner(System.in).nextInt()];
        int i[] = {1, 2, 3, 4};
        int num = 2;
        i = populate(i, num);
        System.out.println(Arrays.toString(i));

        System.out.println(simpleRoomBook(true, 7, 2, 2019));
        System.out.println(uniqueChars("java"));
    }

    public static int[] populate(int[] r, int s) {
        int sume = 0;

        for (int i = 1; i < r.length; i++) {
            sume = r[i];

        }
        return r;


    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        // your code here
        boolean result = true;
        if (isAvailable == true && day >= 1 && day <= 8 && month == 7 && year == 2018) {
            result = false;

        }else if  (year > 2018) {
            result = false;
        }
        return result;
    }

    public static String uniqueChars(String str) {
        //T: write your code

        String word = "";
            if (str.charAt(str.length()-1) != str.charAt(str.length()-1)) {
                word += str;
        }
            return word;

        }
     }