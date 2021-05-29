package day48_constructors_static;

public class Customer {
    private String name;
    private int id;

    // No-Args Constructor

    public Customer() {
        System.out.println("No-Args constructor");
        name = "new customer";
        id = -1;
    }

    // dd a constructor where we can assign name and id

    public Customer(String name, int id) {
        System.out.println("2-args constructor");
        this.name = name;  // setName(name);
        this.id = id;  // setId(id); when we have some condition in setter, reuse that condition
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // this setter is good for condition in order to reuse it
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
