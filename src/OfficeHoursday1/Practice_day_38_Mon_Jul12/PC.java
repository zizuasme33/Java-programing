package OfficeHoursday1.Practice_day_38_Mon_Jul12;

public class PC extends PB implements PI{

    int num;
    String name;

    // PC is a PB
    // PC has a num
    // PC has a name


    @Override
    public void math() {
        System.out.println("Doing math");
    }

    @Override
    public void go() {
        System.out.println("PC GO");
    }

}
