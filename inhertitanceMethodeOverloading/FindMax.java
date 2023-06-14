package inhertitanceMethodeOverloading;

public class FindMax {
	public int findMax(int a,int b) {
		if(a>b) {
			return a;
			
		}
		else {
			return b;
			
		}
	}
	public String findMax(String a,String b) {
		if(a.length()>b.length()) {
			return a;
			
		}
		else {
			return b;
		}
	}

}
