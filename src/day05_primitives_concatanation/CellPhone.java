package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){

        String brand = "Apple";
        String model = "Iphone 12 pro Max";
        String color = "Blue";
        double price = 1099.99;
        int storage = 128;
        boolean hasCamera = true;


        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
        System.out.print(storage);
        System.out.println(" GB");
        System.out.println(hasCamera);


        // with messages
        System.out.println("Brand is " + brand );
        System.out.println("Model is " + model );
        System.out.println("Color is " + color );
        System.out.println("Price is $" + price);
        System.out.println("Storage is " + storage +"GB");
        System.out.println("Haa Camera? -" + hasCamera);






    }
}
