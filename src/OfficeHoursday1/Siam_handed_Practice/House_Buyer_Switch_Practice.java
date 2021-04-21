package OfficeHoursday1.Siam_handed_Practice;

public class House_Buyer_Switch_Practice {
    public static void main(String[] args) {
        String  neighborhoodName = "Hills";
        int averagePrice;
        double rating;
        boolean gated, allowPets;

        switch (neighborhoodName) {
            case "Hills":
                neighborhoodName = "Hills";
                averagePrice = 89_000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                System.out.println("neighborhoodName = " + neighborhoodName);
                System.out.println("averagePrice = " + averagePrice);
                System.out.println("rating = " + rating);
                System.out.println("gated = " + gated);
                System.out.println("allowPets = " + allowPets);
                break;
            case "Oaks":
                neighborhoodName = "Hills";
                averagePrice = 75_000;
                rating = 3.5;
                gated = false;
                allowPets = true;
                System.out.println("neighborhoodName = " + neighborhoodName);
                System.out.println("averagePrice = " + averagePrice);
                System.out.println("rating = " + rating);
                System.out.println("gated = " + gated);
                System.out.println("allowPets = " + allowPets);
                break;
            case "Highland":
                neighborhoodName = "Highland";
                averagePrice = 150_000;
                rating = 4.5;
                gated = true;
                allowPets = false;
                System.out.println("neighborhoodName = " + neighborhoodName);
                System.out.println("averagePrice = " + averagePrice);
                System.out.println("rating = " + rating);
                System.out.println("gated = " + gated);
                System.out.println("allowPets = " + allowPets);
                break;
            case "Canyon":
                neighborhoodName = "Canyon";
                averagePrice = 201_000;
                rating = 4.8;
                gated = true;
                allowPets = true;
                System.out.println("neighborhoodName = " + neighborhoodName);
                System.out.println("averagePrice = " + averagePrice);
                System.out.println("rating = " + rating);
                System.out.println("gated = " + gated);
                System.out.println("allowPets = " + allowPets);
                break;
            default:
                System.out.println(neighborhoodName);
        }


    }
}

//You are buying a new house and need to collect information about the houses in a specific area. You will give the neighborhood name and see the average house price, rating of school districts near by(out of 5), if it is a gated community or not, allow pets or not.
//
//Make variables for all of that information. Given empty defaults for all except the neighborhood name. Print the information once at the end.
//
//    Data based on neighborhood name:
//
//        name - Hills
//        average price - 89,000
//        rating - 4.0
//        gated - no
//        allow pets - yes
//
//        name - Oaks
//        average price - 75,000
//        rating - 3.5
//        gated - no
//        allow pets - yes
//
//        name - Highland
//        average price - 150,000
//        rating - 4.5
//        gated - yes
//        allow pets - no
//
//        name - Canyon
//        average price - 201,000
//        rating - 4.8
//        gated - yes
//        allow pets - yes