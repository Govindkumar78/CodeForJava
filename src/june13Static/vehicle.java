package june13Static;

public class vehicle {
	static class car{
		String type;
	}class bike{
	int cc=250;
	}
int tyre;
int color;
void run() {
	System.out.println("veh is running");
}
public static void main(String[] args) {
	vehicle v1=new vehicle();
	v1.tyre=6;
	System.out.println(v1.tyre);
}
}
