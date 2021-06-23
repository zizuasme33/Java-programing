package day56_abstraction.driveable;

public interface SelfDrivable {

    void autoPiloting(); // default abstract created
    // void selfParking(); this causes error in sub classes, because they must override abstract method
    public default void selfPark(){ // if we add default method, it will prevent error (this default method only exist in interface)
        System.out.println("performing self park steps");
    }

}
