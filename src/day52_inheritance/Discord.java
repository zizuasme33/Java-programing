package day52_inheritance;

public class Discord extends MobileApp{

    public void chat(String someone) {
        System.out.println("Chatting with " + someone + " on discord");
    }

    /**
     * override download method
     */

    @Override
    public boolean download() {
        System.out.println("Downloaded discord 0.0.23 from App Store");
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Vladislav");
    }
}
