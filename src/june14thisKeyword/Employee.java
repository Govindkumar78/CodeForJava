package june14thisKeyword;

public class Employee {
public String name;
public void setName(String gg) {
	this.name=gg;
	
}
public String getName() {
	return name;
}
private Employee(int salary) {
	System.out.println("salary is transfered to Employee account" + salary);
	
}
public Employee(int paisa,String Id) {
	this(paisa);
	System.out.println("work has been done");
}
}
