package june12MultiInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Manager manager = new Manager("John Doe", 40, 1001, "Engineering", 10);
	        
	       
	        manager.displayPersonalInfo();
	        System.out.println();
	        
	      
	        manager.displayEmployeeInfo();
	        System.out.println();
	        
	       
	        manager.displayManagerInfo();
	    }
	
	

}
