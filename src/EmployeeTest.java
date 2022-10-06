public class EmployeeTest {

    public static void main(String[] args) {
        System.out.println("Employee Class Tester");

        // Test 1: Create new employees
        Employee employee1 = new Employee("Noah", "Tuff", 3000);
        Employee employee2 = new Employee("Marty", "McFly", 1955);
        printEmployeeInfo(employee1);
        printEmployeeInfo(employee2);

    }

    public static void printEmployeeInfo(Employee employee){
        System.out.printf("First name: %s\nLast name: %s\nBalance: $%.2f\n", employee.getFirstName(), employee.getLastName(), employee.getMonthlySalary());
    }
}
