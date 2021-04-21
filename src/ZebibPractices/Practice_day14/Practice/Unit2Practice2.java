package ZebibPractices.Practice_day14.Practice;

public class Unit2Practice2 {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i <= 3; i++) {
//            sum +=i;
//
//        }
//        System.out.println("sum = " + sum);

//        for (int i = 0; i < 100; i++) {
//            if (i % 2 ==0) {
//                System.out.print(i + " ");
//
//
//            } else {
//                    System.out.println(+i + " ");
//                }
//
//        }
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 ==0 && i % 5 == 0 ) {
//                System.out.println("FizzBuzz = " + i);
//            }else if (i % 3==0) {
//                System.out.println("Fizz = " + i);
//            }else if (i % 5==0) {
//                System.out.println("Buzz = " + i);
//            }else {
//                System.out.println(i + " ");
//            }
//
//        }
//        int start = 3;
//        int end = 6;
//        for (int i = start; i <= end; i++ ) {
//            System.out.println(i);
//        }
//        int n = 2;
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + ( n * i));
//
//        }

//        int n = 10;
//
//        for (int i = 1 ; i <=  n; i++) {
//            switch (i) {
//                 case 1:
//                     System.out.println("Monday");
//                     break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                default:
//                    System.out.println("no such a day");
//
//            }
//
//        }

        String word= "java";
        char letter = 'a';
        int count = 0;
       for (int i = 0; i < word.length(); i++) {
           if (word.charAt(i) == letter) {
               count++;
           }

       }
        System.out.println(count);










        
    }
}
