package day16_switch_ternary;

public class TrinaryIntro {
    public static void main(String[] args) {
        int score = 90;
        //             () is optional          : ( else)
        String result =( score < 60) ? "Pass" : "Fail"; // parenthesis id
        System.out.println("result = " + result);
    }
}
