package ZebibPractices.Practice_day14.Replit;

import java.util.*;

public class PracticeReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter laptop price:");
        int laptopPrice = scan.nextInt();


        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if(screenSize == 13.3) {
            laptopPrice +=200;
            System.out.println(laptopPrice);
        } else if(screenSize == 15.0) {
            laptopPrice += 300;
            System.out.println(laptopPrice);

        }else if (screenSize == 17.3) {
            laptopPrice +=400;
            System.out.println(laptopPrice);

        }
        System.out.println("Select CPU type:");
        String cpuType = scan.next();

        if(cpuType.equals("i3")) {
            laptopPrice +=150;
            System.out.println(laptopPrice);
        } else if(cpuType.equals("i5")) {
            laptopPrice += 250;
            System.out.println(laptopPrice);

        }else if (cpuType.equals("i7")) {
            laptopPrice += 3500;
            System.out.println(laptopPrice);
        }

        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        laptopPrice += (ramSize * 50) /4;




        System.out.println("Enter Storage type:");
        String storageType = scan.next();

        System.out.println("Enter memorry size:");
        int memory = scan.nextInt();

        if(storageType.equals("HDD")) {
            laptopPrice += (memory / 500) * 50;
            System.out.println(laptopPrice);
        } else if (storageType.equals("SDD")) {
            laptopPrice += (memory / 500) * 100;
            System.out.println(laptopPrice);

        }

        System.out.println("Enter screen resolution:");
        String screenResolution = scan.next();
        switch (screenResolution) {
            case "FULLHD":
                    laptopPrice +=100;
            break;
            case "4K":
                break;

        }
        System.out.println("Laptop price is:"+laptopPrice);


    }
}
