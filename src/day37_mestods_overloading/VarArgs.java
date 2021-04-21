package day37_mestods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23, 45, 54, 23, 45, 3,35,4, 53, 42, 52, 452, 412,52);
        addNumbers();

        // int ... my numbers 10, 4; ERROR: var - args can ONLY be used as a method parameter

    }


    // inside the method, it is used as regular array
    public static void addNumbers (int ... nums) {
        int sum = 0;
        for (int n : nums) {
            sum +=n;

        }
        System.out.println("sum = " + sum);

    }
}
