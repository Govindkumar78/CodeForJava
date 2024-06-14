package june13Static;

public class Student {
String name;
String subject;
static String collegeName="IES";
//method area,heap area,stack area
public static void main(String[] args) {
	Student s=new Student();
	s.name="Govind";
	s.subject="cs";
	s.collegeName="JRU";
	System.out.println(s.name);
	System.out.println(s.subject);
	System.out.println(s.collegeName);
	
	
	
	

	
}

}
