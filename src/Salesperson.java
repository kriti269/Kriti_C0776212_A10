import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Represents a salesperson
 * Inherits Employee class
 * @author Kriti C0776212
 */
public class Salesperson extends Employee {
    double totalSales;
    double rateOfCommission;
    double totalCommission;
    double advancePayment;

    /**
     * Initializes a Salesperson object
     * @param employeeId int
     * @param firstName String
     * @param lastName String
     * @param gender Gender
     * @param totalSales double
     * @param advancePayment double
     */
    public Salesperson(int employeeId, String firstName, String lastName, Gender gender,
                       double totalSales, double advancePayment) {
        super(employeeId, firstName, lastName, gender);
        this.totalSales = totalSales;
        this.rateOfCommission = rateOfCommission;
        this.totalCommission = totalCommission;
        this.advancePayment = advancePayment;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getRateOfCommission() {
        return rateOfCommission;
    }

    public void setRateOfCommission(double rateOfCommission) {
        this.rateOfCommission = rateOfCommission;
    }

    public double getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(double totalCommission) {
        this.totalCommission = totalCommission;
    }

    public double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
    }


    /**
     * Overloaded function. Sets the rateOfCommission based on
     * totalSales. Calls calculateCommission() to set the total
     * commission from rateOfCommission.
     */
    public void setRateOfCommission(){

        if(this.totalSales >= 22000){
            this.rateOfCommission = 16;
        }
        else if(this.totalSales >= 18000){
            this.rateOfCommission = 15;
        }
        else if(this.totalSales >= 15000){
            this.rateOfCommission = 12;
        }
        else if(this.totalSales >= 10000){
            this.rateOfCommission = 10;
        }
        else{
            this.rateOfCommission = 5;
        }
        this.calculateCommission();
    }


    /**
     * Calculates totalCommission based on rateOfCommission and totalSales.
     */
    private void calculateCommission(){

        this.totalCommission = this.rateOfCommission/100 * this.totalSales;
    }


    /**
     * Calculates pay by deducting advancePayment from totalCommission.
     */
    @Override
    public void calculatePay() {

        this.pay = this.totalCommission - this.advancePayment;
    }


    /**
     * Displays gross pay to be deducted or deposited.
     */
    @Override
    public void display() {
        String message = "Hi " + this.firstName + " " + this.lastName + "! ";
        Locale canadian = new Locale("en", "CA");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(canadian);

        if(this.pay > 0){
            message = message.concat(numberFormat.format(this.pay) + " will be deposited to your account!");
        }
        else{
            message = message.concat(numberFormat.format(Math.abs(this.pay)) + " will be deducted from your account!");
        }
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * Displays employee details
     */
    @Override
    public void displayEmployeeDetails(){
        Locale canadian = new Locale("en", "CA");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(canadian);
        String employeeDetails = "";
        employeeDetails = employeeDetails.concat("\nId: " + this.employeeId);
        employeeDetails = employeeDetails.concat("\nName: " + this.firstName + " " + this.lastName);
        employeeDetails = employeeDetails.concat("\nGender: " + this.gender);
        employeeDetails = employeeDetails.concat("\nAdvance pay: " + numberFormat.format(this.advancePayment));
        employeeDetails = employeeDetails.concat("\nGross pay: " + numberFormat.format(this.pay));
        JOptionPane.showMessageDialog(null, employeeDetails);
    }

}
