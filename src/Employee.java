/**
 * @author 20148596
 */

public class Employee {
    private String firstName;
    private String lastName;
    private Double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(Double monthlySalary) {
        if (monthlySalary <= 0){
            this.monthlySalary = (double) 0;
        } else{
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Double getMonthlySalary(){
        return monthlySalary;
    }

    public void raiseMonthlySalary(double raisePercentage){
        double newMonthlySalary = this.getMonthlySalary() * (raisePercentage / 100) + this.getMonthlySalary();
        this.setMonthlySalary(newMonthlySalary);
    }

}
