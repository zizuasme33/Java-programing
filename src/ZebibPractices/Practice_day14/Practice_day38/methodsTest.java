package ZebibPractices.Practice_day14.Practice_day38;

public class methodsTest {
    public static void main(String[] args) {
     //   start(); continues();
      //  printNums(1);
        System.out.println("isNullOrEmpty (\"hello\") = " + isNullEmpty("Hello"));
        String word = null;
        System.out.println("isNullOrEmpty (\"word\") = " + isNullEmpty(word));
         word = "";
        System.out.println("isNullOrEmpty (\"word\") = " + isNullEmpty(word));

    //     Palindrome



    }

    // Method call another method
    public static void start(){
        System.out.println("start");
        continues();
    }
    public static void continues(){
        System.out.println("continues");
       end();
    }
    public static void end(){
        System.out.println("end");
    }

    // IQ QUESTIONS how do you print 1 -100 without a loop
    //Recursive methods
    public static void printNums(int num){
        System.out.print(num + " ");
        num++;
        if (num <= 10) {
            printNums(num);
        }

    }

    // Someone else project can add to your project (library java)
    public static boolean isNullEmpty(String str){
       return str== null || str.isEmpty();
    }

    // Palindrome Practice With String calling from another calss
    public static boolean isPalindrome1(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String reverseWord(String str){
        String word = "";
        for (int i = str.length()-1; i >= 0; i--) {
          word += str.charAt(i);

        }
        return word;
    }

    public static boolean found (int [] nums, int num) {
        boolean found = false;
        for (int each : nums){
            if (each == num) {
                found = true;
                break;
            }
        }
        return found;
    }
}
