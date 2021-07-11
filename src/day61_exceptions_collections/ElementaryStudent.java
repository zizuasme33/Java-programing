package day61_exceptions_collections;

public class ElementaryStudent {

    private String name;
    private int age;

    public ElementaryStudent() {} // Empty Constructor

    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // check if name is null first, otherwise we might get nullPointer exception
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }// no need else because it will not get there, it will throw exception and it will stop
        // if name is all numbers , or start with number

        this.name = name;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age> 12)  {
            throw new IllegalArgumentException("Age can not be < 5 or > 12");

        }else {
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
