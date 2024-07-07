package oops;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// now creating object of student
		Student st1;
	st1	=new Student() ;
	st1.studentName="Ram";
	st1.studentId= 202;
	st1.studentCity="Ranchi";
	st1.study();
	st1.showFullDetails();
	
	Student st2=new Student();
	st2.studentId=5555;
	st2.studentCity="Chatra";
	st2.studentName="Mohan";
	st2.study();
	st2.showFullDetails();
	}

}
