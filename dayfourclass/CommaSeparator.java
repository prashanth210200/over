package dayfourclass;

public class CommaSeparator {
	public static void main(String[] args) {
		String a=args[0];
		String[] name=a.split(",");
		System.out.println(name[0].toUpperCase());
		System.out.println(name[1].toLowerCase());
		System.out.println("Array lenght is "+name.length);
		
		
	}

}
