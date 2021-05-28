package OfficeHoursday1.Practice_day_29_Wed_May19;

public class MyBackYard {
    public static void main(String[] args) {
        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();
       // birdOne.canFly(); -> don't compile
        birdOne.setCanFly(true);
        System.out.println(birdOne.canFly());
        birdOne.setBeakLength(-1);
        System.out.println(birdOne.getBeakLength());


    }
}
