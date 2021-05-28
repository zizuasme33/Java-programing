package OfficeHoursday1.Siam_handed_Practice.classandobject;

public class AnimalSpicePractice {
    String name;
    int population;
    int growth;

    public void setInfo(String petName, int petPopulation, int growthRate) {
        name = petName;
        population = petPopulation;
        growth = growthRate;

    }
    public String getName(){
        return name;
    }
    public int getPopulation() {
       return population;
    }
    public int getGrowthRate() {
        return growth;
    }

    @Override
    public String toString() {
        return "Animal Spice Practice: {" +
                "name = '" + name + '\'' +
                ", population = " + population + "million" +
                ", growth = " + growth + "%"+
                '}';
    }
}
