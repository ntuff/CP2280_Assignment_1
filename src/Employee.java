/**
 * @author 20148596
 */

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    /**
     *
     * @param firstName
     * @param lastName
     * @param monthlySalary
     */
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param monthlySalary
     */
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0){
            this.monthlySalary = monthlySalary;
        }
    }

    /**
     *
     * @return
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName(){
        return lastName;
    }

    /**
     *
     * @return
     */
    public double getMonthlySalary(){
        return monthlySalary;
    }

    /**
     *
     * @param raisePercentage
     */
    public void raiseMonthlySalary(double raisePercentage){
        double newMonthlySalary = this.getMonthlySalary() * (raisePercentage / 100) + this.getMonthlySalary();
        this.setMonthlySalary(newMonthlySalary);
    }

}
