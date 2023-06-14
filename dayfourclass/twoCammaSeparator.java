package dayfourclass;

public class twoCammaSeparator {
	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		String[]name1=a.split(",");
		String[]name2=b.split(",");
		System.out.println(name1[0].concat(name2[0]));
		int num1=Integer.parseInt(name1[1]);
		int num2=Integer.parseInt(name2[1]);
		System.out.println(num1+num2);
		
	}

}