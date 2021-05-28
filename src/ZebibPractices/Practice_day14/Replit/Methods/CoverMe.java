package ZebibPractices.Practice_day14.Replit.Methods;

import java.util.Arrays;

public class CoverMe {

    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me"));
        
    }
    public static String coverString(String main, String coverME) {
        // your code here

        String cover = "";

        if (main.contains(coverME)) {
            cover += main.replace(coverME, "["+coverME+"]");
        }else {
            cover += "["+main+"]";

        }
        
        
        return cover;
        
        







        

}
    
}
