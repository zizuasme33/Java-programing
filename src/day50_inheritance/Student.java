package day50_inheritance;

public class Student extends Person{
    // Students IS-A Person
    String school;

    public void study (String topic){
        System.out.println(name + " is studying " + topic + " at " + school);
        System.out.println("age is " + age);
    }

}
