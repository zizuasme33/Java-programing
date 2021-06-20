package day55_abstarction.interface_demo;

public class FireFoxDriver implements WebDriver {
    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver - quiting the driver");
    }

    @Override
    public String getTitle() {
        return "Wooden spoon title";
    }
}
