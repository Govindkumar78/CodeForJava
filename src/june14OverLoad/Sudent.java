package june14OverLoad;

public class Sudent {

	// same class me there will multiple method with same name but deferent parameter
	public int adt(int a,int b) {
		return a+b;
		
	}
	public int adt(int a,int b,int c) {
		return a+b+c;
		
	}
	public static void main(String[] args) {
		Sudent s=new Sudent();
		System.out.println(s.adt(12,10));
		
		System.out.println(s.adt(12,10,67));
	}
}

