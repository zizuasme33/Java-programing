package day17_terinary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {

        char model = 'S';
        String trim = "Long range";
        if (model=='S') {
            System.out.println("model s");
            if (trim.equals("Long range")) {
                System.out.println("range: 415");
                System.out.println("top speed: 155 mph");
                System.out.println("0-60- 3.1sec");

            }else {
                if (trim.equals("Plaid+")) {
                    System.out.println("range: 415");
                    System.out.println("top speed: 155 mph");
                    System.out.println("0-60- 3.1sec");

                    if (trim.equals("Plaid+")) {
                        System.out.println("range: 415");
                        System.out.println("top speed: 155 mph");
                        System.out.println("0-60- 3.1sec");

                    }else
                        if(model=='3') {
                            System.out.println("model = " + model);
                        }

                }


            }
        }


        }

    }

