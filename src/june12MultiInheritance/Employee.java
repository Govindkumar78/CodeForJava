package june12MultiInheritance;

class Employee extends Person {
    private int employeeId;
    private String department;

    public Employee(String name, int age, int employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    public void displayEmployeeInfo() {
    	displayPersonalInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

