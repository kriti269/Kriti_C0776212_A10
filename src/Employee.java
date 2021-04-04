/**
 * Represents an employee
 * Implements PayCalculator interface.
 * @author Kriti C0776212
 */
public abstract class Employee implements PayCalculator{
    public int employeeId;
    protected String firstName;
    protected String lastName;
    protected Gender gender;
    protected double pay;

    /**
     * Initializes an Employee object.
     * @param employeeId Integer Employee id
     * @param firstName String first name
     * @param lastName String last name
     * @param gender Gender enum
     */
    public Employee(int employeeId, String firstName, String lastName, Gender gender) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Abstract method to display employee details.
     * To be implemented by a child class.
     */
    abstract void displayEmployeeDetails();
}
