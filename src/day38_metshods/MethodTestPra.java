package day38_metshods;

import ZebibPractices.Practice_day14.Practice_day38.methodsTest;

public class MethodTestPra {
    public static void main(String[] args) {

        System.out.println("palindrome = "+  methodsTest.isPalindrome1("civic"));
        System.out.println("Palindrome  = " + methodsTest.isPalindrome1("java"));
        System.out.println("Reversed word = " + methodsTest.reverseWord("java"));


        // Arrays call from another practice

        int [] nums = {1,2,3,4,5};
        int num = 5;
        System.out.println("5 Found match = " + methodsTest.found(nums, num));
        System.out.println("8 not found = " + methodsTest.found(new int [] {1, 2, 3, 4}, 5));



    }
}
