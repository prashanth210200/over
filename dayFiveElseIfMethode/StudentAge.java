package dayFiveElseIfMethode;

public class StudentAge {
	public static void main(String[] args) {
		int a=20;
		int b=25;
		int c=22;
		if(a>b && a>c) {
			System.out.println("std1 is Elder");
		}
		else if (b>a && b>c) {
			System.out.println("std2 is Elder");
		}
		else {
			System.out.println("Std 3 is Elder");
		}
	}

}
