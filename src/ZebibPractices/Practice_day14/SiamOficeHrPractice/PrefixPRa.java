package ZebibPractices.Practice_day14.SiamOficeHrPractice;

public class PrefixPRa {
    public static void main(String[] args) {
        String str = "abcXHFabc";
        int n = 3;
        String prefix = str.substring(0, n);
        String remaining = str.substring(n);
        if (remaining.contains(prefix)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
