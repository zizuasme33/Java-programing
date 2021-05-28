package ZebibPractices.Practice_day14.SiamOficeHrPractice;

public class countWord {
    public static void main(String[] args) {

        String str = "java is fun. java class today, java is not fun, and not javascript";
        int count = 0;

        while (str.contains("java")){
            count++;
            str = str.replaceFirst("java", "");

        }
        System.out.println("java is found "+ count + " times");

        // 2nd option

        String word = "java is fun. java class today, java is not fun, and not javascript";
        int cnt = 0;

        for (int i = 0; i < word.length()-3; i++) {
            String eachLetter = word.substring(i, i+4);
            if (eachLetter.equals("java")){
                cnt++;
            }

        }
        System.out.println("cnt = " + cnt);

    }
}
