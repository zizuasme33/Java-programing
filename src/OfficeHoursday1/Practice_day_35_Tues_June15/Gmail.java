package OfficeHoursday1.Practice_day_35_Tues_June15;

public class Gmail extends Email{

    static String domain;

    static {
        domain = "Gmail";
    }
    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
    public static void sendSuperEmail(){
        Email.sendEmail();
    }


    public static void sendEmail(){
        System.out.println("Sending from Gmail");
    }

}
