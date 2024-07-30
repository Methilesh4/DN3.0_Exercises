public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size++] = employee;
        } else {
            System.out.println("Array is full, cannot add more employees.");
        }
    }

    // Method to search for an employee by ID
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    // Method to traverse and print all employee records
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Method to delete an employee by ID
    public boolean deleteEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null; // Clear the last element
                size--;
                return true;
            }
        }
        return false;
    }

    // Main method to test the system
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        system.addEmployee(new Employee("E001", "Alice", "Manager", 75000));
        system.addEmployee(new Employee("E002", "Bob", "Developer", 60000));
        system.addEmployee(new Employee("E003", "Charlie", "Designer", 50000));
        system.addEmployee(new Employee("E004", "Diana", "Analyst", 65000));
        system.addEmployee(new Employee("E005", "Eve", "Intern", 30000));

        // Traversing and printing all employees
        System.out.println("All Employees:");
        system.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearch Employee with ID 'E003':");
        Employee emp = system.searchEmployee("E003");
        System.out.println(emp != null ? emp : "Employee not found.");

        // Deleting an employee
        System.out.println("\nDeleting Employee with ID 'E002':");
        boolean deleted = system.deleteEmployee("E002");
        System.out.println(deleted ? "Employee deleted." : "Employee not found.");

        // Traversing and printing all employees after deletion
        System.out.println("\nAll Employees after deletion:");
        system.traverseEmployees();
    }
}
