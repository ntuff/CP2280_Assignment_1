/**
 * Contains Employee class.
 * @author 20148596
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    /**
     * Creates an employee.
     * @param firstName First name of employee. This value must be a string.
     * @param lastName Last name of employee. This value must be a string.
     * @param monthlySalary Amount of dollars paid to employee on a monthly basis. This value must be a double.
     */
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary >= 0){
            this.monthlySalary = monthlySalary;
        }
    }

    /**
     * Replaces the current employee's first name with a new first name. This value must be a string.
     * @param firstName First name of employee. This value must be a string.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the current employee's first name as a string.
     * @return firstName
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Replaces the current employee's last name with a new last name. This value must be a string.
     * @param lastName Last name of employee. This value must be a string.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the current employee's last name as a string.
     * @return lastName
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Replaces the current employee's monthly salary with a new monthly salary. This value must be a double.
     * @param monthlySalary Amount of dollars paid to employee on a monthly basis. This value must be a double.
     */
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0){
            this.monthlySalary = monthlySalary;
        }
    }

    /**
     * Returns the current employee's monthly salary as a double.
     * @return monthlySalary
     */
    public double getMonthlySalary(){
        return monthlySalary;
    }

    /**
     * Raises the employee's monthly salary by a given percentage of itself. Percentage value must be a double.
     * @param raisePercentage percent raise of employee's monthly salary.
     */
    public void raiseMonthlySalary(double raisePercentage){
        double newMonthlySalary = this.getMonthlySalary() * (raisePercentage / 100) + this.getMonthlySalary();
        this.setMonthlySalary(newMonthlySalary);
    }
}
