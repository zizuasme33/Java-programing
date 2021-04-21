package OfficeHoursday1;

public class Apartment {
    public static void main(String[] args) {
        String address = "4801 Kenmore ave";
        String nameOfOwner = " John ";
        short numberOfUnits = 98;
        String averageSizeOfEachUnit = " 830 ";
        double monthlyRent = 1550 ;
        int numberWasher = 48;
        int numberDriers = 48;
        boolean allowPets = true;
        boolean hasPool = true;
        String lengthOfLeas = " For 12 months";
        int totalResident = 300;
        String ownerTellNum = "7036408302";
        boolean isNearGasStation = true;
        int numberOfFloors = 12;
        boolean hasBasement = false;
        int availableUnitsForRent = 15;
        boolean hasAirCondition = true;
        int numberOfParking = 120;
        boolean hasWheelChairAccess = true;
        String numberOfReviewStars = " 4 out of 5";

        double rentAfter3Years = monthlyRent *  3;
        double rentAfter6Years = monthlyRent * 6;
        int numberOfResident = (totalResident / numberOfUnits);
        int averageParking = (numberOfParking / numberOfUnits);
        int parkingSpot = (numberOfParking / numberOfUnits);
        int numberUnitsPerfloor = ( numberOfUnits / numberOfFloors);

        System.out.println(" ********* Welcome To West Building*********");
        System.out.println(" \t At " + address);
        System.out.println("We have a Promotion with ONE Month Free for a person that moving this coming Month. ");
        System.out.println("Contact to " + nameOfOwner + "at this Number: " + ownerTellNum);
        System.out.println("numberUnitsPerfloor = " + numberUnitsPerfloor);
        System.out.println("Specific Detail on our units are" );
        System.out.println("We have " + numberOfUnits + " number of Units");
        System.out.println("We have " + numberWasher + " number of washer and " + numberDriers + " number of driers.");
        System.out.println("Our average size of the units " + averageSizeOfEachUnit);
        System.out.println("Pets are allowed " + allowPets);
        System.out.println("numberUnitsPerfloor = " + numberUnitsPerfloor);
        System.out.println("Our Leasing policy is for " + numberUnitsPerfloor);



        System.out.println("rentAfter3Years = " + rentAfter3Years);




        // create a class named Apartment
        //create a main method
        //
        //    Create the variables with the most appropriate datatype:
        //
        //        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)
        //
        //        - Create these variables and use previous variables to get the values
        //
        //            - monthly rent after 3 years (discount 10% off original rent)
        //            - monthly rent after 6 years (discount 20% off original rent)
        //            - Average number of residents per unit (total residents / number of units)
        //            - Average number of parking spots per unit ( parking spots / units)
        //            - Average number of units per floor ( units / number of floors)
    }
}
