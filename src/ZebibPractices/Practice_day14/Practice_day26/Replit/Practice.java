package ZebibPractices.Practice_day14.Practice_day26.Replit;
import java.util.*;
public class Practice {
    public static void main(String[] args) {

   //     Scanner scan = new Scanner (System.in);
        String str =  "aaaabbbabc";//scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i )== str.charAt(i+2)) {
                count++;

            }



        }
        System.out.println(count);

    }
}
