package OfficeHoursday1.Practice_day_29_Wed_May19;

public class Birds {


    // Birds.bird = new Birds();
    // bird.setSpecies();

    private String species;
    private boolean canFly;
    private double beakLength;


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species; // this. is an instance of this class Birds object
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        //        if(beakLength < 0) {
//            return;
//        }
//        this.beakLength = beakLength;

        if(beakLength > 0) {
            this.beakLength = beakLength;
        } else {
            System.out.println("Invalid length");
        }

    }
}
