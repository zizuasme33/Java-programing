package ZebibPractices.Practice_day14.Practice_day18;

public class Switch_Practice_and_nestedIf {
    public static void main(String[] args) {
        
        String make = "Audi";
        String model= "SQ5";
        int leasePrice = 0;
        if (make.equals("Mercedes")) {
            if (model.equals("E"))
            leasePrice = 400;
        }else if (model.equals("A")) {
            leasePrice = 500;

        }else {
            if (make.equals("Audi")) {
                leasePrice = 400;

            }else if (model.equals("SQ5")) {
                leasePrice = 600;

            }
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasingPrice = " + leasePrice);
    }
}
