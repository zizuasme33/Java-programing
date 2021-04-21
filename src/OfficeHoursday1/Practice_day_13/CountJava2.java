package OfficeHoursday1.Practice_day_13;

public class CountJava2 {
    public static void main(String[] args) {
        String str = "java is fun. java class today, not javascript";
        int count = 0;

        // str.substring ( 0,4) -- manually check
//        str.substring ( 1, 5)
//        str.substring ( 2, 6)

        for (int i = 0; i < str.length()-3; i++) {
            String eachFourLetters = str.substring(i, i+4 ); //0 + 0+4 = java
            if (eachFourLetters.equals("java")) {
                count++;

            }
            System.out.println(count);


        }

    }
}
