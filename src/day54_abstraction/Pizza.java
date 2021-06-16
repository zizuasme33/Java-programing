package day54_abstraction;

public class Pizza extends MenuItem {


    @Override
    public void prepare() {
        System.out.println("Stretch the dough and out toppings and cheese and bake it");
    }

    @Override
    public void serve() {
        System.out.println("serve in palate ot un a box");
    }
}
