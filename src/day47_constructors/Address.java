package day47_constructors;

public class Address {

    String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    // constructor - automatically called
    //Same name as Class name and no return type and special method
    public Address() {
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "Unknown";
        state = "Unknown";
        zipCode = "00000";
    }
        // public Address(street, city, state)
        // second constructor, overload constructor -> provides shortcut to initialize variables
        // in same statement : ex: Address ad = new Address ("8501 Tyco Rd 1A", "Vienna", "VA", "22182")
        public Address (String street, String city, String state, String zipCode) {

        this.street = street;
        setStreet(street); // reuse the code in the setter method
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;

        }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR: Invalid street");
            // System.exit(0);
        }else {
            this.street = street;
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;

    }

    @Override
    public String toString() {
        return street + ", " + city + ", "+ state + " " + zipCode ;
    }
}
