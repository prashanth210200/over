package sixDayFORmethode;

public class PalindromMethode {
	public static void main(String[] args) {
		
	
	String name="prashanth";
	String reverse="";
	for (int i=name.length()-1;i>=0;i--) {
		reverse=reverse+name.charAt(i);
	}
	if (name.equalsIgnoreCase(reverse)) {
		System.out.println(name+" is palindrom");
	}
		else {
			System.out.println(name+" is not a palindrom");
		}
		
	}

}
