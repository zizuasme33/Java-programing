package ZebibPractices.Practice_day14.Practice_day30;

public class ArrayPractice {
    public static void main(String[] args) {

       // 3rd Practice with double

//        double [] price = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
//        for (double count : price) {
//            if (count >= 10 && count <= 50) {
//                System.out.print("count = " + count + ", ");
//            } else if (count >= 70 && count <= 100) {
//                System.out.print("\ncount = " + count + ", ");
//        }
//
//        }
//        //Practice with String
//        String [] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
//                "Albania", "Brazil", "Portugal", "China", "Philippines",
//                "Philippines", "China", "Philippines", "China", "Armenia", "Philippines",
//                "China", "Colombia", "Philippines", "Honduras", "Indonesia",
//                "Brazil", "China", "United States", "Russia"};
//        String result = "";
//
//        for (String country : countries) {
//            if (country.length() >= 4 && country.length() <= 7) {
//                System.out.println(country + " ");


//
//            }
//
//        }

//        int [] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
//
//
//        for (int each : data) {
//           if (each  == data.length/2) {
//               System.out.print(each + " ");
//           }
//        }
        String [] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda"};
       String newArrays="";
        for (String item : arr) {
            if (item.substring(0, 3).equals(arr.length)) {
                newArrays += item;
                System.out.println (newArrays);




            }


        }






    }
}
