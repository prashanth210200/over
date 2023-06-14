package sixDayFORmethode;

public class Prime {
	public String getprime (int a) {
		boolean isprime=true;
		for(int i=2;i<a;i++) {
		if(a%i==0) {
			isprime=false;
		}
		}
		if(isprime==true) {
			return"Prime";
		}
		else {
			return"notPrime";
		}
	}
		
		public String getprime1 (String word) {
		//	String a="";
			String b="";
			for(int i=word.length()-1;i>=0;i--) {
				b=b+word.charAt(i);
			}
		if(b.equals(word)) {
			return"Palindrom";
				
			}
		else {
			return "not Palindrom";
		}
		
		}
}


