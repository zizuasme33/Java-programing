package OfficeHoursday1.Practice_day_19_April19_2021;

public class MethodClass {
    /**
     Void -> run a block of code, there is no return value
     Arrays.sort() -> takes an array, sorts it, doesn't return anything

     Return -> runs a block of code, but there is a return value(single return value)
     Arrays.binarySearch() -> takes an array and element, tries to find the element, return

     */
    public static void main(String[] args) {


    }
    public static void methodOne(){
        System.out.println("one");
    }
    public static String methodTwo(){
        return "Two";
    }
    public static int methodThree(String word){
       return word.length();
    }
    public static boolean login(String username, String password){
        return true;
    }

}
