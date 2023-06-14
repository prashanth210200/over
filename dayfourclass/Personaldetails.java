package dayfourclass;

public class Personaldetails {
	public static void main(String[] args) {
		String name=args[0];
		int lmsID=Integer.parseInt(args[1]);
		long contno= Long.parseLong(args[2]);
		boolean ispresent=Boolean.parseBoolean(args[3]);
		char initial=args[4].charAt(0);
		float weight=Float.parseFloat(args[5]);
		System.out.println(name+" "+ lmsID+contno+ispresent+initial+weight);
		
		
		
		
		
		
	}

}
