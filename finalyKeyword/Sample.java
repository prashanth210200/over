package finalyKeyword;

public class Sample {
	public static void main(String[] args) {
		try {
			int  a= 21;
			int b=8;
			int c=a/b;
			System.out.println(c);
			
		}
		catch(Exception f) {
			System.out.println("Given data Invalid");
		}
		finally {
			System.out.println("welcome");
	
		}
	}
}
