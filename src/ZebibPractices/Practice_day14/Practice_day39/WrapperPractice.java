package ZebibPractices.Practice_day14.Practice_day39;

public class WrapperPractice {
    public static void main(String[] args) {
        int n = 15;
        Integer n2 = new Integer(n);
        System.out.println("n2 = " + n2);
        
        byte b = 10;
        Byte b2 = new Byte((byte) b);
        System.out.println("b2 = " + b2);

        // Auto - Boxing primitive to wrapper
        int num = 5;
        Integer num2 = num;
        System.out.println("num2 = " + num2);
        
        // Un Boxing  wrapper to primitive
        Integer un = new Integer(50);
        int in = un;
        System.out.println("in = " + in);

        String name = "345";
        int nam = Integer.parseInt(name);
        double d = Double.parseDouble(name);
        short s = Short.parseShort(name);
        System.out.println("s = " + s + "  " + d + " " + nam);
        
        
    }
}
