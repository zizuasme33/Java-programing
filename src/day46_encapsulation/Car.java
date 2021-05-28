package day46_encapsulation;

public class Car {
    // encapsulated/ hidden instance variable
   private String model;
    private int year;
    private int mileage;

   // setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }
    // getter method from model
    public String getModel(){
        return model;
    }

    //setter for year

    public void setYear(int year) {
        this.year = year;
    }

    // getter method for year
    public int getYear(){
        return year;
    }
    //getter setter for mileage
    // generate toString
    public int getMileage(){
        return mileage;//this.mileage; also works fine
    }
    //myCar.setMileage(45230);
    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }

}
