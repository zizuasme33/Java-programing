package OfficeHoursday1.Practice_day_35_Tues_June15;

public class Email {

    final String ADDRESS;
    int numberOfEmail;
    static String domain;

    static {
        domain = "generic";
    }

    public Email (String address, int numberOfEmail) {
        this.ADDRESS = address;
        this.numberOfEmail = numberOfEmail;
    }

    public static void sendEmail(){
        System.out.println("Sending from PARENT");
    }

    @Override
    public String toString() {
        return "Email{" +
                "Address='" + ADDRESS + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", domain=" + domain +
                '}';
    }
}
