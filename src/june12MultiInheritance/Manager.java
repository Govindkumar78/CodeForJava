package june12MultiInheritance;

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, int employeeId, String department, int teamSize) {
        super(name, age, employeeId, department);
        this.teamSize = teamSize;
    }

    public void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
