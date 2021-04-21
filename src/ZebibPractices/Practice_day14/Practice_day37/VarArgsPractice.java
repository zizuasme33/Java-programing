package ZebibPractices.Practice_day14.Practice_day37;

public class VarArgsPractice {
    public static void main(String[] args) {
        // Var Args Practice call
        System.out.println(addNumber(1,2,3));
        System.out.println(addNumber(10, 20, 30, 40, 50));
        System.out.println(addNumber(10, 10, 20, 20, 40, 50, 100, 200, 300, 400, 500, 200, 50, 100, 1000));

        // Method Practice last one call

        System.out.println(repeatString("java", 3, '|'));


    }

    // Var Args Practice

    public static int addNumber (int ... num){
        int sum = 0;
        for (int each : num) { // this will help us to add large number
            sum += each;

        }

        return sum;
    }





    // Method Practice last one

    public static String repeatString (String word, int times, char delimiter) {
        String result = "";
        for (int i = 1; i <= times; i++) {
            if (i == times) {
                result += word;

            } else {
                result += word + delimiter; //add with delimiter
            }
        }
        return  result;
    }

}
