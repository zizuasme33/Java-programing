package day05_primitives_concatanation;

public class UsingVariable {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        num1 = 200;
        System.out.println(num1);
        System.out.println(num2);

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

       // zizu practice
        int henokZipCode = 22304;
        int zebibZipCode = henokZipCode;
        System.out.println(henokZipCode);
        System.out.println(zebibZipCode);

        henokZipCode = 22206;
        zebibZipCode = 222834;
        System.out.println(henokZipCode);
        System.out.println(zebibZipCode);


    }
}
