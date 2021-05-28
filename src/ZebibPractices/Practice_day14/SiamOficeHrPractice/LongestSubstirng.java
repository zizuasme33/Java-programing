package ZebibPractices.Practice_day14.SiamOficeHrPractice;

public class LongestSubstirng {
    public static void main(String[] args) {

        // tis is good to check for the middle one but not at the end index
        String str = "aaabbbcccdeeee";
        String longestSubstring = "";
        String temp = "";
        for (int i = 0; i < str.length() -1; i++) {

            temp += str.charAt(i);

            if (str.charAt(i) != str.charAt(i +1)){

                if (temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;

                }
                temp = "";
            }



        }
        System.out.println("longestSubstring = " + longestSubstring);

    }
}
