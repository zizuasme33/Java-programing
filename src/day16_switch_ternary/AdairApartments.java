package day16_switch_ternary;

public class AdairApartments {
    public static void main(String[] args) {

        System.out.println("==== WELCOME TO OUR APARTMENTS =====");

        int numberOfBedrooms = 10;
        double startingPrice = 0;

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899.0;
                break;
            default:
                System.out.println("5 bedroom currently not available");
                break;

              //  return; (this exit main method)
        }

       System.out.println("Starting price $" + startingPrice);
    }
}
