package java8revision;

public class Methods {
	public void findmin(int[] n) {
	int min=n[0];
	for(int x:n) {
		if(x<=min) {
			min=x;
		}
		}
	System.out.println(min);
	}
	
	
	public void upperCase1(String m) {
		System.out.println(m.toUpperCase());
		
	}
	}
