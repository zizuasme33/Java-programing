package OfficeHoursday1.Practice_day_35_Tues_June15;

public class Yahoo extends Email {

    static String domain;

    static {
        domain = "Yahoo";
    }

    public Yahoo(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
