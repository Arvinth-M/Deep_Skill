public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        System.out.println("--- Adding Employees ---");
        ems.addEmployee(new Employee("E001", "Alice Smith", "Software Engineer", 75000.00));
        ems.addEmployee(new Employee("E002", "Bob Johnson", "Project Manager", 90000.00));
        ems.addEmployee(new Employee("E001", "Alice Duplicate", "Developer", 80000.00));

        ems.traverseEmployees();

        System.out.println("\n--- Searching Employees ---");
        Employee foundEmployee = ems.searchEmployee("E002");
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee);
        } else {
            System.out.println("Employee E002 not found.");
        }

        foundEmployee = ems.searchEmployee("E004");
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee);
        } else {
            System.out.println("Employee E004 not found.");
        }

        System.out.println("\n--- Deleting Employees ---");
        ems.deleteEmployee("E002");

        ems.traverseEmployees();
    }
}