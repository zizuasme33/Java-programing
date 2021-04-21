package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;

        if (floorNum == 7 ){
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        }else {
            System.out.println("Invalid floor - 6");
        }

        System.out.println("============Switch Statement Version=========");

        floorNum = 1;
        switch(floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            break; // exit the switch statement
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            break;
            default:
                System.out.println("Invalid floor - 6" + floorNum);
                break; // it does not matter to put it

        }

    }
}


