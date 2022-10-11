/**
 * @author 20148596
 */

public class EmployeeTest {

    public static void main(String[] args) {
        System.out.println("Employee Class Tester");

        // Test 1: Create new employees
        Employee employee1 = new Employee("Noah", "Tuff", 3000);
        Employee employee2 = new Employee("Marty", "McFly", 1955);
        printEmployeeInfo(employee1);
        printEmployeeInfo(employee2);

        // Test 2: Change first name
        employee2.setFirstName("Emmit");
        printEmployeeInfo(employee2);

        // Test 3: Change last name
        employee2.setLastName("Brown");
        printEmployeeInfo(employee2);

        // Test 4: Raise monthly salary by percentage
        employee1.raiseMonthlySalary(7.5);
        printEmployeeInfo(employee1);

        // Test 5: Set monthly salary to negative number
        employee2.setMonthlySalary((double) - 1800);
        printEmployeeInfo(employee2);

    }

    public static void printEmployeeInfo(Employee employee){
        System.out.printf("First name: %s\nLast name: %s\nBalance: $%.2f\n\n", employee.getFirstName(), employee.getLastName(), employee.getMonthlySalary());
    }
}
