package ZebibPractices.Practice_day14.Practice_day20;

public class day20_practice {
    public static void main(String[] args) {

      String word = "zebib";
        System.out.println(word.toUpperCase());
        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ","").replace(",","").replace(" results for java book","");
        System.out.println(result);

        // 2dn practice charAt method
        String word1 = "java";
        System.out.println(word1.charAt(0));



    }


}
