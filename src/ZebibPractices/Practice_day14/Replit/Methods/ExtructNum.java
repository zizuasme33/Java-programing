package ZebibPractices.Practice_day14.Replit.Methods;

public class ExtructNum {
    public static String extractNum(String s) {

        String num = "";

        for (int i = 0; i < s.length(); i++) {
            char numDigit = s.charAt(i);

            if (numDigit >= '0' && numDigit <= '9' ) {
                num += s.charAt(i) + "";
            }


        }
        return num;


    }

    public static void main(String[] args) {

        System.out.println(extractNum("aa2aa3"));


}



}
