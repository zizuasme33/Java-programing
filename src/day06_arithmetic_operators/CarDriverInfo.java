package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String model = "Toyota CHR.";
        String driverName = "Zebib";
        String licenseNum = "LN777984";
        short speed =  60;
        boolean isAutomatic = true;
        char licenseClass = 'D';



        System.out.println("Car Model:\t\t\t\t" + model);
        System.out.println("Driver Name:\t\t\t" + driverName);
        System.out.println("License Number:\t\t\t" + licenseNum);
        System.out.println("Speed:\t\t\t\t\t" + speed);
        System.out.println("Is the car Automatic?\t" + isAutomatic);
        System.out.println("License Class:\t\t\t" + licenseClass);

        System.out.println( "*******************************" );

        System.out.println( model + " is car model.");
        System.out.println(driverName + " is Driving a car ");
        System. out.println(driverName + " is driving " + model);
        System. out.println( "Zebib current speed is " + speed + " mph.");
        System.out.println(driverName  + model);
//  we can add string = string , or boolean +""+char
        System.out.println( "*******************************" );
        System.out.println( licenseClass+"-"+isAutomatic);



    }
}
