package ZebibPractices.Practice_day14.Replit.Methods;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String word = "mohammad";


    }

    public static String nonDuplicate(String name) {
        String output = "";

        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (!output.contains(name.charAt(i)+"")) {
                output +=name.charAt(i);

            }

        }
        return output ;
    }
}
