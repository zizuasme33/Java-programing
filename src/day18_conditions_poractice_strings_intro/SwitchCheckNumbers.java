package day18_conditions_poractice_strings_intro;

public class SwitchCheckNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        switch(num1) {
            case 10:
                num1++;
                num2+=10;
                //break;
            case 20:
                num1+=num2;
                num2--;
              //break;
            case 30: // if we don't have break in case 20
                num1 = 0; // will come strait here and number will be 0
                num2 -= 3;// this number will be 9-3 = 6
                break;
                
        }
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
