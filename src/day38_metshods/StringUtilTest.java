package day38_metshods;
        /**
        * import all static methods. so that you can just call by method name,
        without classname
        */
import static day38_metshods.StringUtils.*; // static import help us to import StringUtils instead of writing again(StringUtils.isPalindrome)

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username can not be null or empty");

        }
        
       // for palindrome

        System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));
        
        // for reversed
        String word = "sunday";
        String reversed = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);
        System.out.println(StringUtils.reverse(word));
       // System.out.println("words reverse (\"java\") = " + StringUtils.reverse("java"));
    }

}
