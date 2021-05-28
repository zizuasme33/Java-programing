package ZebibPractices.Practice_day14.Practice;

import java.util.ArrayList;

import java.util.*;

import static java.util.Collections.*;

public class Arrays_Review {
    public static <ArraysList> void main(String[] args) {

        String [] str = {"java", "html", "js", "ruby", "css"};

        for (int i = 0, j = str.length-1; i < str.length/2; i++, j--){
          String reverse = str[i];
          str[i] = str[j];
          str[j] = reverse;


        }
        System.out.println(Arrays.toString(str));

        int [] nums = {5, 10, 4, 100};

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;

        }
        System.out.println(Arrays.toString(nums));

        String word = "java";
        String []strWords = word.split("a");
        int count = strWords.length-1;
        if (word.endsWith("a")){
             count ++;
        }
        System.out.println("count = " + count);
        alphaphetic(1993);

        emailR("zizu asme", "gmail");

        checkEligible(500);
        System.out.println(fullName());

     boolean result =   login("cybertekStudent", "abc123");
        System.out.println("result = " + result);

        System.out.println(getDay(1));
        printNum(2);

        // Wrapper Class
        
        Integer n = 60;
        System.out.println("n/2 = " + n/2);
        
        // autoboxing 
        int m = 20;
        Integer b = m ; // or  (new Integer(m));
        System.out.println("Autoboxing = " + b);
        
        // unboxing 
        Integer u = 10;
        int d = u;
        System.out.println("Unboxing = " + d);
        
        
        // covert string to int 
        String s = "100";
        int p = Integer.parseInt(s); // or // Integer.valueOf(s);
        System.out.println("s = " + p/10);
        
        Double r = 10.0;
        String f = r.toString();  // or   r +"";
        System.out.println("f = " + f);

        System.out.println(Integer.max(100, 2));
        System.out.println(Integer.sum(10, 3));

        System.out.println(Integer.compare(2, 3));
        System.out.println(Character.isDigit('5'));

        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,2,4,5,4));
        num.add(10);
        System.out.println("num = " + num);
        for (int each : num) {
            if (Collections.frequency(num, each) == 1){
                System.out.print(each + " ");
            }
        }
        System.out.println();
        num.forEach(tt -> System.out.println(tt + tt));
        sort(num);
        
        System.out.println("num = " + num);
        
        ArrayList<String> letter = new ArrayList<>();
        
        letter.addAll(Arrays.asList("java", "css","html", "python", "java"));
        for (String each : letter) {
            if (Collections.frequency(letter, each) ==1) {
                System.out.print(each+ " ");
            }
        }
        System.out.println();
        System.out.println("letter = " + letter);
        System.out.println(letter.size());
        Collections.reverse(letter);
        System.out.println("letter = " + letter);
        System.out.println(Collections.frequency(letter, "java"));
        System.out.println(Collections.max(letter));
        System.out.println(Collections.min(letter));
        Collections.replaceAll(letter, "java", "git");
        System.out.println("letter = " + letter);
        Collections.sort(letter);
        System.out.println("letter = " + letter);
        
//        String h = null;
//        h.toUpperCase() ;//==> ERROR: nullpointerException
//        System.out.println("h = " + h);

//        String wor = null;
//       // System.out.println(wor.isEmpty()); // NullPointerException
//        if(wor == null || wor.isEmpty()) {
//            System.out.println("wor = " + wor);
//        }

     //   AUTO-BOXING EX:
        int t = 50;
        Integer n1 = t;

        //UNBOXING
        Integer x = new Integer(432);
        int n2 = x;















    }
    public static void alphaphetic(int num){
        int age = 2021 - num;
        System.out.println(age);

    }

    public static void emailR(String name, String domain){
        name = name.replace(" ", "_");
        String email = name + "@" +  domain  + ".com";
        System.out.println(email);
    }

    public static void checkEligible(int creditScore) {

        if (creditScore >= 700) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }


    }

    public static String fullName() {
        return "Mike Smith";
    }

    public static boolean login(String userName, String password){
        boolean result = true;
        String secretUsername ="cybertekStudent", secretPassword = "abc123";
        if (userName.equals(secretUsername) && password.equals(secretPassword)) {
           result = true;
        }else {
           result = false;
        }
        return result;
    }

    public static String getDay(int day){
        switch (day){
            case 1 :
                return "Monday";
            case 2:
                return "Tuesday";
        }
        return null;
    }

    // recursive method
    public static void printNum(int num){
        System.out.println("num = " + num);
        num+=2;
        if (num <= 10) {
            printNum(num);
        }

    }
}
