package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

                                        // This Two is interfaces (SelfDrivable, Greeting)
public class Tesla extends Transportation implements SelfDrivable, Greeting {
        // tesla is our class and extends and hasARelation to transportation and implementing multiple inheritance(Greeting and selfDriving

    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * 0.10) + " to drive " + mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving autonomous mode");
    }

    @Override
    public void hi() {
        System.out.println("hello hello peep peeep");
    }

    @Override
    public void bye() {
        System.out.println("bye bye charge me charge me");
    }
}
