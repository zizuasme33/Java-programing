package ZebibPractices.Practice_day14.Practice_day45;

public class CoffeePractice {
    int amount;
    String type;
    String hotCold;


    @Override
    public String toString() {
        return "CoffeePractice{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                ", hotCold='" + hotCold + '\'' +
                '}';
    }



    public void refill(int ref ){
        amount = ref;
    }
    public void drinkA (int someAmount) {
        if (someAmount <= amount && someAmount >= 0) {
            amount = amount - someAmount;
        }

    }
    public int getAmount(){
        return amount;
    }
    public void setType(String typeD){
      type= typeD;
    }
    public String getType(){
        return type;
    }
    public void setHotCold(String hotDrink){
        hotCold = hotDrink;
    }
    public String getHotCold(){
        return hotCold;
    }

    public static void main(String[] args) {
        CoffeePractice starbucks = new CoffeePractice();
        starbucks.refill(100);
        System.out.println("starbucks.getAmount() = " + starbucks.getAmount());
        starbucks.drinkA(10);
        starbucks.setType("Cappuccino");
        System.out.println("starbucks.getType() = " + starbucks.getType());
        System.out.println(starbucks.toString());
       starbucks.setHotCold("Hot");
        System.out.println("starbucks.getHotCold() = " + starbucks.getHotCold());



        

    }
}
