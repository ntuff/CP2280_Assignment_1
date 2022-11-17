package Assignment1;

/**
 * Contains Employee class that may be used by an employer to hold basic employee info.                 <p>
 * This class allows for modification of employee information if so desired.

 * @author 20148596
 * <pre>
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    /**
     * Creates an employee
     * @param firstName First name of employee
     * @param lastName Last name of employee
     * @param monthlySalary Amount of dollars paid to employee on a monthly basis
     */
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary >= 0){
            this.monthlySalary = monthlySalary;
        }
    }

    /**
     * Sets the employee's first name
     * @param firstName First name of employee
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the employee's first name
     * @return firstName
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Sets the employee's last name
     * @param lastName Last name of employee
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the employee's last name
     * @return lastName
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Sets the employee's monthly salary
     * @param monthlySalary Amount of dollars paid to employee
     */
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0){
            this.monthlySalary = monthlySalary;
        }
    }

    /**
     * Gets the employee's monthly salary
     * @return monthlySalary
     */
    public double getMonthlySalary(){
        return monthlySalary;
    }

    /**
     * Raises the employee's monthly salary by a given percentage of itself
     * @param raisePercentage percent raise of employee's monthly salary
     */
    public void raiseMonthlySalary(double raisePercentage){
        double newMonthlySalary = this.getMonthlySalary() * (raisePercentage / 100) + this.getMonthlySalary();
        this.setMonthlySalary(newMonthlySalary);
    }
}
