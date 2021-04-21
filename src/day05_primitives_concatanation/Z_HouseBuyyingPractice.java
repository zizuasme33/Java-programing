package day05_primitives_concatanation;

public class Z_HouseBuyyingPractice {
    public static void main(String[] args){
        String houseType = "Townhouse";
        int bedroom = 4, kitchen = 1, bathroom = 3;
        double price = 420000;
        double rate = 4.5;
        boolean basement = true, attic = false, park = true, pool = false, forSale = true;
        int streetNum = 9114 ;
        String streetName = " Tiffany Park CT, ";
        String state = "Springfield VA,";
        int zipcode = 22152;

        System.out.println("******** BUYING A HOUSE***********");
        System.out.println("The House Type:\t\t\t\t\t\t\t\t" + houseType + "\nThe number of bedroom is:\t\t\t\t\t" + bedroom
        +"\nThe number of kitchen is:\t\t\t\t\t" + kitchen +"\nThe number of bathroom is:\t\t\t\t\t" + bathroom + "\nIs there an basement?\t\t\t\t\t\t" + basement + "\nIs there an attic?\t\t\t\t\t\t\t" +
        attic + "\nIs there a pool?\t\t\t\t\t\t\t" + pool + "\nIs the house for sale?\t\t\t\t\t\t" + forSale +
                "\nCost of the house is:\t\t\t\t\t\t$" + price + "\nThe Address of the house is:\t\t\t\t" + streetNum +  streetName +
                "\n\t\t\t\t\t\t\t\t\t\t\t" + state +  "\n\t\t\t\t\t\t\t\t\t\t\tZipcode- " + zipcode + "\nIs the park near by?\t\t\t\t\t\t" + park +
                "\nRating of surrounding school district:\t\t" + rate + "(out of 5)");


    }
}
