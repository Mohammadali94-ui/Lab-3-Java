public abstract class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Abstract method
    public abstract double earnings();

    // toString override
    @Override
    public String toString() {
        return firstName + " " + lastName +
                "\nSSN: " + socialSecurityNumber;
    }
}