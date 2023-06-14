package scannerClass;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println(("enter your initial"));

		System.out.println("Enter your age");
		int age=s.nextInt();
		System.out.println(("Enter your mailid"));
		String mail=s.next();
		System.out.println("enter your weight");
		float mal=s.nextFloat();
		System.out.println("enter your height");
		double  height=s.nextDouble();
		System.out.println("enter your aadhar number");
		long adha=s.nextLong();
		
		
		System.out.println("name="+name+" ,Age="+age+" ,Mailid="+mail+" ,weight="+mal+" ,Height="+height+" ,adhaar="+adha);
		
	}

}
