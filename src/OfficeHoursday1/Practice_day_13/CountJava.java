package OfficeHoursday1.Practice_day_13;

public class CountJava {
    public static void main(String[] args) {

        String str = "java is fun. java class today, not javascript";
        int count = 0;
        while (str. contains("java")) {
            count ++;
            str= str.replaceFirst("java", "");
        }


        //" is fun. class today, not javascript";
        // count = 3;
        System.out.println("Java is found " + count + " times");
    }
}
