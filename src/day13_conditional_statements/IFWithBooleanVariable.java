package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if(isHungry) { // or (condition == true) long way to do
            System.out.println("I am hungry I will go get something to eat!");
            System.out.println("Then coda Java");
        }else{
            System.out.println("I am not hungry, I will keep coding java!");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200; // 200 budget
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable){
            System.out.println("I can Afford it lets buy!");
        }else{
            System.out.println("Too expensive, lets keep coding java");
        }

        boolean isRemotejob = false;
        // if (isRemoteJob ! + true) ( ! ) this portion/ sign is for explanation
        //if (is isRemoteJob == false)
        if(!isRemotejob ){
            System.out.println("Sorry I am not interested");
        }else{
            System.out.println("Sure I am interested, what is the interview process?");
        }





    }

}
