package ZebibPractices.Practice_day14.Practice_day26;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 1st Practice
        int number = 2;
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + "x " + i + " = " +(number * i));

        }
        // 2nd Practice

        for (int day = 1; day <=10; day++) {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                    //etc.....
            }
        }
        // 3rd Practice
                //     01234
        String word = "Zebib";
        for(int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + " ");
            System.out.println();
        }
        word= "java";

        for (int i = word.length()-1; i >= 0; i--) {
            System.out.println(word.charAt(i));
        }

        String w = "zzza";
        char letter = 'z';
        int count =0;
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i)==letter) {
                count++;

            }

        }
        System.out.print("There are " +count + " " + letter +" in java ");

        String n = "zebina";
        String s = " zebib aloku tbla ala";

        String z = "Belize";
        System.out.println(z.substring(0));





    }


}
