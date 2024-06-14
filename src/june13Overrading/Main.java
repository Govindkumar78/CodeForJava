package june13Overrading;

public class Main {
public static void main(String[] args) {
	Bank b=new Bank();
	System.out.println(b.rate());
	SBI sb=new SBI();
	System.out.println(sb.rate());
	AXIS axis=new AXIS();
	System.out.println(axis.rate());
	
	//Private only in class
	// default same package only
	//protected same package only or child class
	//public---full project
}
}
