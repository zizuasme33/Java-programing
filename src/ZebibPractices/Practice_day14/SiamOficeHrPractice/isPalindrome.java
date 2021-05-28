package ZebibPractices.Practice_day14.SiamOficeHrPractice;

public class isPalindrome {
    public static void main(String[] args) {
        String word = "anna";
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() /2; i++) {
            
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                isPalindrome = false;
                break;
            }

        }

        System.out.println("isPalindrome = " + isPalindrome);
    }
}
