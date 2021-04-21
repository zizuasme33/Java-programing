package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchFowWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy Search Smoke Test completed - Pass -");

    }
    public static void openBrowser() {
        System.out.println("Launching Chrome browser");

    }
    public static void navigateToEtsyUrl() {
        System.out.println("Navigating to the http://www.etsy.com/");

    }
    public static void searchFowWoodenSpoon() {
        System.out.println("Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden Spoon' in search field and click search");

    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("PASS: Search result are successfully displayed");
    }

}
