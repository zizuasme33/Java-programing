package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        // add is static method, can be called using Classname.staticMethodName
        // static way of calling the method
        Calculator.add(5,3); // 8

       // Calculator.multiply(2,4); ERROR: multiply is not static . need object to call is

        //multiply is instance method and we are creating object and calling it
        Calculator calcObject = new Calculator();
        calcObject.multiply(2, 4); // 8

        // static method can also be called using an object , but intellij will give warning, but still working
        calcObject.add(10, 45); // 55

    }
}
