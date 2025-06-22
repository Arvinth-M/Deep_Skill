class EmployeeManagementSystem {
    private Employee[] employees;
    private int currentSize; 
    private static final int MAX_EMPLOYEES = 10;

    public EmployeeManagementSystem() {
        this.employees = new Employee[MAX_EMPLOYEES];
        this.currentSize = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (currentSize < MAX_EMPLOYEES) {
            for (int i = 0; i < currentSize; i++) {
                if (employees[i].employeeId.equals(employee.employeeId)) {
                    System.out.println("Error: Employee with ID " + employee.employeeId + " already exists.");
                    return false;
                }
            }
            employees[currentSize] = employee;
            currentSize++;
            System.out.println("Employee added: " + employee.name);
            return true;
        } else {
            System.out.println("Error: Employee array is full. Cannot add " + employee.name);
            return false;
        }
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < currentSize; i++) {
            if (employees[i].employeeId.equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public boolean deleteEmployee(String employeeId) {
        for (int i = 0; i < currentSize; i++) {
            if (employees[i].employeeId.equals(employeeId)) {
                System.out.println("Employee deleted: " + employees[i].name);
                for (int j = i; j < currentSize - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[currentSize - 1] = null;
                currentSize--;
                return true;
            }
        }
        System.out.println("Error: Employee with ID " + employeeId + " not found for deletion.");
        return false;
    }

    public void traverseEmployees() {
        if (currentSize == 0) {
            System.out.println("No employees in the system.");
            return;
        }
        System.out.println("\n--- Employee Records ---");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("------------------------");
    }
}