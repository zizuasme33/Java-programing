package day52_inheritance;

public class MobileApp {
    String name;
   double version;

   protected boolean download() {
       System.out.println("App: " + name + " version:" + version + " is download");
       return true;
   }

    public void useTheApp(int minutes) {
        System.out.println("Using " + name + " app for " + minutes + " minutes");
    }

}
