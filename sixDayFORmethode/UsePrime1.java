package sixDayFORmethode;

public class UsePrime1 {
	public static void main(String[] args) {
		int a=9;
		boolean isPrime=true;
  	for(int i=2;i<a;i++) {
			if(a%i==0) {
				isPrime=false;
			}
			
		}
		if(isPrime==true) {
			System.out.println(a+"is prime");
		}
		else {
			System.out.println(a+"is not prime");
		}
	}
	
	

}
