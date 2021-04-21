package OfficeHoursday1;

public class ClassMovie {
    public static void main(String[] args) {
        String name = "The Photograph";
        String writerName = "Stella Meghie";
        String genre = " Drama / Romance !";
        String duration = "2 hours.";
        String priceForAdult = "$15";
        String priceForChildren = "$10";
        String releaseDate = " February 28, 2020.";
        String rottenTomatoesRating = "74%";
        String cast = " Issa Rae, LaKeith Stanfield, Y'Ian Noel, Chante Adams, Teyonah Parris, Rob Morgan.";
        double rating = 4.0;
        boolean sequels = false;
        boolean onDvd = true;

        System.out.println("----- Welcome to the Cinema -----");
        System.out.println();
        System.out.println("Tonight we are streaming a movie that called " + "\"" + name + "\"" + " which was released on" + releaseDate);
        System.out.println("This " + genre + " movie " + "got " + rottenTomatoesRating + " rating on Rotten Tomatoes.");
        System.out.println();
        System.out.println("The rating is - " + rating + " *****, " + " and it runs for " + duration );
        System.out.println("This movie does not have a sequel and it's on dvd.");
        System.out.println();
        System.out.println("Writer Name = \t\t\t " + writerName + "\nCasts = \t\t\t\t" + cast + "\nPrice for adults = \t\t "  + priceForAdult
        + "\nPrice for children = \t " + priceForChildren);
    }
}