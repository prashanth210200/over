package functionalInterface;

public class UseFindPositiveNumber {
	public static void main(String [] args) {
		
		FindPositiveNumber pos = s-> {
		for(Integer x:s) {
			if(x>0) {
				System.out.println( x+" is positive");
			}
			else {
				System.out.println(x+" is negative");
			}
		}
		};
		int [] a= {12,-12,22,-22,23,-54};
		pos.findPosNum(a);
	}
}


