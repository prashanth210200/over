package objectarray;

public class Student {
	String name;
	int age;
	float weight;
	boolean ispresent;
	public String toString() {
		return "Brand="+name+", age="+age;
	}  
	
	public void display1() {
		System.out.println("This is non static");
	}
	
	public static void display() {
		System.out.println("This is static");
	}

}
