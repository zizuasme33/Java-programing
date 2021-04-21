package day38_metshods;

public class ArrayUtils {
    public static void main(String[] args) {


    }
    static public void printArray(int[] nums){
        for (int num : nums) {
            System.out.print(num +  " ");

        }
        System.out.println();

    }


    static public int sum(int [] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;

        }
        return sum;
    }

    static public boolean contains(int []nums, int num) {
        boolean found = false;
        for (int each : nums) {
            if (each == num) {
                found = true;
                break;
            }
        }
        return found;

    }

}
