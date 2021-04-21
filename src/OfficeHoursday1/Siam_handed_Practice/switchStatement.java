package OfficeHoursday1.Siam_handed_Practice;

public class switchStatement {

    public static void main(String[] args) {


        String genre = "Detective";
        int averagePageLength = 0;
        String averageNumberProfit = "";
        int averageNumberOfSequels =0;
        int averageNumberOfCountries = 0;

        switch(genre) {
            case "Fantasy":
                averagePageLength = 500;
                averageNumberProfit = "1,000,000";
                averageNumberOfSequels = 5;
                averageNumberOfCountries = 50;
                break;
            case "Detective":
                averagePageLength = 350;
                averageNumberProfit = "700,000";
                averageNumberOfSequels = 3;
                averageNumberOfCountries = 45;
                break;
            case "Science Fiction":
                averagePageLength = 7200;
                averageNumberProfit = "900,500";
                averageNumberOfSequels = 4;
                averageNumberOfCountries = 30;
                break;
            case "Short Story":
                averagePageLength = 150;
                averageNumberProfit = "300,000";
                averageNumberOfSequels = 1;
                averageNumberOfCountries = 40;
                break;
            default:
                System.out.println("neighborhood name");

        }
        System.out.println("genre = " + genre);
        System.out.println("averagePageLength = " + averagePageLength);
        System.out.println("averageNumberProfit = " + averageNumberProfit);
        System.out.println("averageNumberOfCountries = " + averageNumberOfSequels);
        System.out.println("averageNumberOfCountries = " + averageNumberOfCountries);







        //Author] - Look at CappuccinoBuyer from class for an idea
        //
        //You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing. Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in.
        //
        //Make variables for all of that information. Given empty defaults for all except the neighborhood name. Print the information once at the end.
        //
        //    Data based on genre:
        //
        //        genre - Fantasy
        //        page length - 500
        //        profit - 1,000,000
        //        sequels - 5
        //        countries - 50
        //
        //        genre - Detective
        //        page length - 350
        //        profit - 700,000
        //        sequels - 3
        //        countries - 45
        //
        //        genre - Science Fiction
        //        page length - 720
        //        profit - 900,500
        //        sequels - 4
        //        countries - 30
        //
        //        genre - Short Story
        //        page length - 150
        //        profit - 300,000
        //        sequels - 1
        //        countries - 40
    }
}
