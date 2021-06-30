package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {

        // variable of worker and object of superman
        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan) worker).playingWithKid();

        // DOWNCASTING from Worker to Superman
        SuperMan superMan = (SuperMan) worker;
        superMan.feedKid();
        superMan.work("java dev");

    }
}
