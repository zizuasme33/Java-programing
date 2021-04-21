package OfficeHoursday1.Practice_day_11;

public class Sandwich {
    public static void main(String[] args) {
        String str = "breadjambread";

        if (str.contains("bread")) {
            int firstBread= str.indexOf("bread");

            if (str.substring(firstBread+5).contains("brad")) { // jambread
                int secondBread = str.lastIndexOf("bread");
                String result =str.substring(firstBread + 5,secondBread);

                System.out.println(result);

                if (result.isEmpty())  {
                    System.out.println("nothing");
                }else
                    System.out.println(result);

            }


        }else {
            System.out.println("nothing");
        }




    }
}
