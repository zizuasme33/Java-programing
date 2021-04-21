package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {

        int [] data = {32, 532, 12, 5455, 22, 123, 543, 999, 321, 3};

        for (int each : data) {
            System.out.println(each);
        }

        for (int n : data) {
            System.out.print(n + " ");
        }

        System.out.println(" ----------For Loop ------------------");

        for (int i = 0; i < data.length; i+=2) {
            System.out.println(data[i]);
        }

        // print last value in array index using length -1

        System.out.println("Last vale: " + data [data.length-1]);

        /// loop all numbers of array  reverse
        for (int idx = data.length -1; idx >= 0; idx--) {  // or idx > -1
            System.out.print(data[idx] + " ");
        }




    }
}
